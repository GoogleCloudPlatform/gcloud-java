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
// source: google/cloud/aiplatform/v1beta1/evaluation_service.proto

package com.google.cloud.aiplatform.v1beta1;

/**
 *
 *
 * <pre>
 * Pairwise metric instance. Usually one instance corresponds to one row in an
 * evaluation dataset.
 * </pre>
 *
 * Protobuf type {@code google.cloud.aiplatform.v1beta1.PairwiseMetricInstance}
 */
public final class PairwiseMetricInstance extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.aiplatform.v1beta1.PairwiseMetricInstance)
    PairwiseMetricInstanceOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use PairwiseMetricInstance.newBuilder() to construct.
  private PairwiseMetricInstance(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private PairwiseMetricInstance() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new PairwiseMetricInstance();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.aiplatform.v1beta1.EvaluationServiceProto
        .internal_static_google_cloud_aiplatform_v1beta1_PairwiseMetricInstance_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.aiplatform.v1beta1.EvaluationServiceProto
        .internal_static_google_cloud_aiplatform_v1beta1_PairwiseMetricInstance_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.aiplatform.v1beta1.PairwiseMetricInstance.class,
            com.google.cloud.aiplatform.v1beta1.PairwiseMetricInstance.Builder.class);
  }

  private int instanceCase_ = 0;

  @SuppressWarnings("serial")
  private java.lang.Object instance_;

  public enum InstanceCase
      implements
          com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    JSON_INSTANCE(1),
    INSTANCE_NOT_SET(0);
    private final int value;

    private InstanceCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static InstanceCase valueOf(int value) {
      return forNumber(value);
    }

    public static InstanceCase forNumber(int value) {
      switch (value) {
        case 1:
          return JSON_INSTANCE;
        case 0:
          return INSTANCE_NOT_SET;
        default:
          return null;
      }
    }

    public int getNumber() {
      return this.value;
    }
  };

  public InstanceCase getInstanceCase() {
    return InstanceCase.forNumber(instanceCase_);
  }

  public static final int JSON_INSTANCE_FIELD_NUMBER = 1;
  /**
   *
   *
   * <pre>
   * Instance specified as a json string. String key-value pairs are expected
   * in the json_instance to render
   * PairwiseMetricSpec.instance_prompt_template.
   * </pre>
   *
   * <code>string json_instance = 1;</code>
   *
   * @return Whether the jsonInstance field is set.
   */
  public boolean hasJsonInstance() {
    return instanceCase_ == 1;
  }
  /**
   *
   *
   * <pre>
   * Instance specified as a json string. String key-value pairs are expected
   * in the json_instance to render
   * PairwiseMetricSpec.instance_prompt_template.
   * </pre>
   *
   * <code>string json_instance = 1;</code>
   *
   * @return The jsonInstance.
   */
  public java.lang.String getJsonInstance() {
    java.lang.Object ref = "";
    if (instanceCase_ == 1) {
      ref = instance_;
    }
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (instanceCase_ == 1) {
        instance_ = s;
      }
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Instance specified as a json string. String key-value pairs are expected
   * in the json_instance to render
   * PairwiseMetricSpec.instance_prompt_template.
   * </pre>
   *
   * <code>string json_instance = 1;</code>
   *
   * @return The bytes for jsonInstance.
   */
  public com.google.protobuf.ByteString getJsonInstanceBytes() {
    java.lang.Object ref = "";
    if (instanceCase_ == 1) {
      ref = instance_;
    }
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      if (instanceCase_ == 1) {
        instance_ = b;
      }
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
    if (instanceCase_ == 1) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, instance_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (instanceCase_ == 1) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, instance_);
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
    if (!(obj instanceof com.google.cloud.aiplatform.v1beta1.PairwiseMetricInstance)) {
      return super.equals(obj);
    }
    com.google.cloud.aiplatform.v1beta1.PairwiseMetricInstance other =
        (com.google.cloud.aiplatform.v1beta1.PairwiseMetricInstance) obj;

    if (!getInstanceCase().equals(other.getInstanceCase())) return false;
    switch (instanceCase_) {
      case 1:
        if (!getJsonInstance().equals(other.getJsonInstance())) return false;
        break;
      case 0:
      default:
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
    switch (instanceCase_) {
      case 1:
        hash = (37 * hash) + JSON_INSTANCE_FIELD_NUMBER;
        hash = (53 * hash) + getJsonInstance().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.aiplatform.v1beta1.PairwiseMetricInstance parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1beta1.PairwiseMetricInstance parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.PairwiseMetricInstance parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1beta1.PairwiseMetricInstance parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.PairwiseMetricInstance parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1beta1.PairwiseMetricInstance parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.PairwiseMetricInstance parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1beta1.PairwiseMetricInstance parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.PairwiseMetricInstance parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1beta1.PairwiseMetricInstance parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.PairwiseMetricInstance parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1beta1.PairwiseMetricInstance parseFrom(
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
      com.google.cloud.aiplatform.v1beta1.PairwiseMetricInstance prototype) {
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
   * Pairwise metric instance. Usually one instance corresponds to one row in an
   * evaluation dataset.
   * </pre>
   *
   * Protobuf type {@code google.cloud.aiplatform.v1beta1.PairwiseMetricInstance}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.aiplatform.v1beta1.PairwiseMetricInstance)
      com.google.cloud.aiplatform.v1beta1.PairwiseMetricInstanceOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.aiplatform.v1beta1.EvaluationServiceProto
          .internal_static_google_cloud_aiplatform_v1beta1_PairwiseMetricInstance_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.aiplatform.v1beta1.EvaluationServiceProto
          .internal_static_google_cloud_aiplatform_v1beta1_PairwiseMetricInstance_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.aiplatform.v1beta1.PairwiseMetricInstance.class,
              com.google.cloud.aiplatform.v1beta1.PairwiseMetricInstance.Builder.class);
    }

    // Construct using com.google.cloud.aiplatform.v1beta1.PairwiseMetricInstance.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      instanceCase_ = 0;
      instance_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.aiplatform.v1beta1.EvaluationServiceProto
          .internal_static_google_cloud_aiplatform_v1beta1_PairwiseMetricInstance_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.PairwiseMetricInstance getDefaultInstanceForType() {
      return com.google.cloud.aiplatform.v1beta1.PairwiseMetricInstance.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.PairwiseMetricInstance build() {
      com.google.cloud.aiplatform.v1beta1.PairwiseMetricInstance result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.PairwiseMetricInstance buildPartial() {
      com.google.cloud.aiplatform.v1beta1.PairwiseMetricInstance result =
          new com.google.cloud.aiplatform.v1beta1.PairwiseMetricInstance(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      buildPartialOneofs(result);
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.aiplatform.v1beta1.PairwiseMetricInstance result) {
      int from_bitField0_ = bitField0_;
    }

    private void buildPartialOneofs(
        com.google.cloud.aiplatform.v1beta1.PairwiseMetricInstance result) {
      result.instanceCase_ = instanceCase_;
      result.instance_ = this.instance_;
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
      if (other instanceof com.google.cloud.aiplatform.v1beta1.PairwiseMetricInstance) {
        return mergeFrom((com.google.cloud.aiplatform.v1beta1.PairwiseMetricInstance) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.aiplatform.v1beta1.PairwiseMetricInstance other) {
      if (other == com.google.cloud.aiplatform.v1beta1.PairwiseMetricInstance.getDefaultInstance())
        return this;
      switch (other.getInstanceCase()) {
        case JSON_INSTANCE:
          {
            instanceCase_ = 1;
            instance_ = other.instance_;
            onChanged();
            break;
          }
        case INSTANCE_NOT_SET:
          {
            break;
          }
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
                java.lang.String s = input.readStringRequireUtf8();
                instanceCase_ = 1;
                instance_ = s;
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

    private int instanceCase_ = 0;
    private java.lang.Object instance_;

    public InstanceCase getInstanceCase() {
      return InstanceCase.forNumber(instanceCase_);
    }

    public Builder clearInstance() {
      instanceCase_ = 0;
      instance_ = null;
      onChanged();
      return this;
    }

    private int bitField0_;

    /**
     *
     *
     * <pre>
     * Instance specified as a json string. String key-value pairs are expected
     * in the json_instance to render
     * PairwiseMetricSpec.instance_prompt_template.
     * </pre>
     *
     * <code>string json_instance = 1;</code>
     *
     * @return Whether the jsonInstance field is set.
     */
    @java.lang.Override
    public boolean hasJsonInstance() {
      return instanceCase_ == 1;
    }
    /**
     *
     *
     * <pre>
     * Instance specified as a json string. String key-value pairs are expected
     * in the json_instance to render
     * PairwiseMetricSpec.instance_prompt_template.
     * </pre>
     *
     * <code>string json_instance = 1;</code>
     *
     * @return The jsonInstance.
     */
    @java.lang.Override
    public java.lang.String getJsonInstance() {
      java.lang.Object ref = "";
      if (instanceCase_ == 1) {
        ref = instance_;
      }
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (instanceCase_ == 1) {
          instance_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Instance specified as a json string. String key-value pairs are expected
     * in the json_instance to render
     * PairwiseMetricSpec.instance_prompt_template.
     * </pre>
     *
     * <code>string json_instance = 1;</code>
     *
     * @return The bytes for jsonInstance.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getJsonInstanceBytes() {
      java.lang.Object ref = "";
      if (instanceCase_ == 1) {
        ref = instance_;
      }
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        if (instanceCase_ == 1) {
          instance_ = b;
        }
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Instance specified as a json string. String key-value pairs are expected
     * in the json_instance to render
     * PairwiseMetricSpec.instance_prompt_template.
     * </pre>
     *
     * <code>string json_instance = 1;</code>
     *
     * @param value The jsonInstance to set.
     * @return This builder for chaining.
     */
    public Builder setJsonInstance(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      instanceCase_ = 1;
      instance_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Instance specified as a json string. String key-value pairs are expected
     * in the json_instance to render
     * PairwiseMetricSpec.instance_prompt_template.
     * </pre>
     *
     * <code>string json_instance = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearJsonInstance() {
      if (instanceCase_ == 1) {
        instanceCase_ = 0;
        instance_ = null;
        onChanged();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Instance specified as a json string. String key-value pairs are expected
     * in the json_instance to render
     * PairwiseMetricSpec.instance_prompt_template.
     * </pre>
     *
     * <code>string json_instance = 1;</code>
     *
     * @param value The bytes for jsonInstance to set.
     * @return This builder for chaining.
     */
    public Builder setJsonInstanceBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      instanceCase_ = 1;
      instance_ = value;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.aiplatform.v1beta1.PairwiseMetricInstance)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.aiplatform.v1beta1.PairwiseMetricInstance)
  private static final com.google.cloud.aiplatform.v1beta1.PairwiseMetricInstance DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.aiplatform.v1beta1.PairwiseMetricInstance();
  }

  public static com.google.cloud.aiplatform.v1beta1.PairwiseMetricInstance getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PairwiseMetricInstance> PARSER =
      new com.google.protobuf.AbstractParser<PairwiseMetricInstance>() {
        @java.lang.Override
        public PairwiseMetricInstance parsePartialFrom(
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

  public static com.google.protobuf.Parser<PairwiseMetricInstance> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PairwiseMetricInstance> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.aiplatform.v1beta1.PairwiseMetricInstance getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
