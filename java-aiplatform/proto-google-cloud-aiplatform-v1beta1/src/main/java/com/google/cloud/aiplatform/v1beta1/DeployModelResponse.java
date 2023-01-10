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
// source: google/cloud/aiplatform/v1beta1/endpoint_service.proto

package com.google.cloud.aiplatform.v1beta1;

/**
 *
 *
 * <pre>
 * Response message for
 * [EndpointService.DeployModel][google.cloud.aiplatform.v1beta1.EndpointService.DeployModel].
 * </pre>
 *
 * Protobuf type {@code google.cloud.aiplatform.v1beta1.DeployModelResponse}
 */
public final class DeployModelResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.aiplatform.v1beta1.DeployModelResponse)
    DeployModelResponseOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use DeployModelResponse.newBuilder() to construct.
  private DeployModelResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private DeployModelResponse() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new DeployModelResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.aiplatform.v1beta1.EndpointServiceProto
        .internal_static_google_cloud_aiplatform_v1beta1_DeployModelResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.aiplatform.v1beta1.EndpointServiceProto
        .internal_static_google_cloud_aiplatform_v1beta1_DeployModelResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.aiplatform.v1beta1.DeployModelResponse.class,
            com.google.cloud.aiplatform.v1beta1.DeployModelResponse.Builder.class);
  }

  public static final int DEPLOYED_MODEL_FIELD_NUMBER = 1;
  private com.google.cloud.aiplatform.v1beta1.DeployedModel deployedModel_;
  /**
   *
   *
   * <pre>
   * The DeployedModel that had been deployed in the Endpoint.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.DeployedModel deployed_model = 1;</code>
   *
   * @return Whether the deployedModel field is set.
   */
  @java.lang.Override
  public boolean hasDeployedModel() {
    return deployedModel_ != null;
  }
  /**
   *
   *
   * <pre>
   * The DeployedModel that had been deployed in the Endpoint.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.DeployedModel deployed_model = 1;</code>
   *
   * @return The deployedModel.
   */
  @java.lang.Override
  public com.google.cloud.aiplatform.v1beta1.DeployedModel getDeployedModel() {
    return deployedModel_ == null
        ? com.google.cloud.aiplatform.v1beta1.DeployedModel.getDefaultInstance()
        : deployedModel_;
  }
  /**
   *
   *
   * <pre>
   * The DeployedModel that had been deployed in the Endpoint.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.DeployedModel deployed_model = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.aiplatform.v1beta1.DeployedModelOrBuilder getDeployedModelOrBuilder() {
    return getDeployedModel();
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
    if (deployedModel_ != null) {
      output.writeMessage(1, getDeployedModel());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (deployedModel_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getDeployedModel());
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
    if (!(obj instanceof com.google.cloud.aiplatform.v1beta1.DeployModelResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.aiplatform.v1beta1.DeployModelResponse other =
        (com.google.cloud.aiplatform.v1beta1.DeployModelResponse) obj;

    if (hasDeployedModel() != other.hasDeployedModel()) return false;
    if (hasDeployedModel()) {
      if (!getDeployedModel().equals(other.getDeployedModel())) return false;
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
    if (hasDeployedModel()) {
      hash = (37 * hash) + DEPLOYED_MODEL_FIELD_NUMBER;
      hash = (53 * hash) + getDeployedModel().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.aiplatform.v1beta1.DeployModelResponse parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1beta1.DeployModelResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.DeployModelResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1beta1.DeployModelResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.DeployModelResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1beta1.DeployModelResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.DeployModelResponse parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1beta1.DeployModelResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.DeployModelResponse parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1beta1.DeployModelResponse parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.DeployModelResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1beta1.DeployModelResponse parseFrom(
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
      com.google.cloud.aiplatform.v1beta1.DeployModelResponse prototype) {
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
   * Response message for
   * [EndpointService.DeployModel][google.cloud.aiplatform.v1beta1.EndpointService.DeployModel].
   * </pre>
   *
   * Protobuf type {@code google.cloud.aiplatform.v1beta1.DeployModelResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.aiplatform.v1beta1.DeployModelResponse)
      com.google.cloud.aiplatform.v1beta1.DeployModelResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.aiplatform.v1beta1.EndpointServiceProto
          .internal_static_google_cloud_aiplatform_v1beta1_DeployModelResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.aiplatform.v1beta1.EndpointServiceProto
          .internal_static_google_cloud_aiplatform_v1beta1_DeployModelResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.aiplatform.v1beta1.DeployModelResponse.class,
              com.google.cloud.aiplatform.v1beta1.DeployModelResponse.Builder.class);
    }

    // Construct using com.google.cloud.aiplatform.v1beta1.DeployModelResponse.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (deployedModelBuilder_ == null) {
        deployedModel_ = null;
      } else {
        deployedModel_ = null;
        deployedModelBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.aiplatform.v1beta1.EndpointServiceProto
          .internal_static_google_cloud_aiplatform_v1beta1_DeployModelResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.DeployModelResponse getDefaultInstanceForType() {
      return com.google.cloud.aiplatform.v1beta1.DeployModelResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.DeployModelResponse build() {
      com.google.cloud.aiplatform.v1beta1.DeployModelResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.DeployModelResponse buildPartial() {
      com.google.cloud.aiplatform.v1beta1.DeployModelResponse result =
          new com.google.cloud.aiplatform.v1beta1.DeployModelResponse(this);
      if (deployedModelBuilder_ == null) {
        result.deployedModel_ = deployedModel_;
      } else {
        result.deployedModel_ = deployedModelBuilder_.build();
      }
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
      if (other instanceof com.google.cloud.aiplatform.v1beta1.DeployModelResponse) {
        return mergeFrom((com.google.cloud.aiplatform.v1beta1.DeployModelResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.aiplatform.v1beta1.DeployModelResponse other) {
      if (other == com.google.cloud.aiplatform.v1beta1.DeployModelResponse.getDefaultInstance())
        return this;
      if (other.hasDeployedModel()) {
        mergeDeployedModel(other.getDeployedModel());
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
                input.readMessage(getDeployedModelFieldBuilder().getBuilder(), extensionRegistry);

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

    private com.google.cloud.aiplatform.v1beta1.DeployedModel deployedModel_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.aiplatform.v1beta1.DeployedModel,
            com.google.cloud.aiplatform.v1beta1.DeployedModel.Builder,
            com.google.cloud.aiplatform.v1beta1.DeployedModelOrBuilder>
        deployedModelBuilder_;
    /**
     *
     *
     * <pre>
     * The DeployedModel that had been deployed in the Endpoint.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1beta1.DeployedModel deployed_model = 1;</code>
     *
     * @return Whether the deployedModel field is set.
     */
    public boolean hasDeployedModel() {
      return deployedModelBuilder_ != null || deployedModel_ != null;
    }
    /**
     *
     *
     * <pre>
     * The DeployedModel that had been deployed in the Endpoint.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1beta1.DeployedModel deployed_model = 1;</code>
     *
     * @return The deployedModel.
     */
    public com.google.cloud.aiplatform.v1beta1.DeployedModel getDeployedModel() {
      if (deployedModelBuilder_ == null) {
        return deployedModel_ == null
            ? com.google.cloud.aiplatform.v1beta1.DeployedModel.getDefaultInstance()
            : deployedModel_;
      } else {
        return deployedModelBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * The DeployedModel that had been deployed in the Endpoint.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1beta1.DeployedModel deployed_model = 1;</code>
     */
    public Builder setDeployedModel(com.google.cloud.aiplatform.v1beta1.DeployedModel value) {
      if (deployedModelBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        deployedModel_ = value;
        onChanged();
      } else {
        deployedModelBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The DeployedModel that had been deployed in the Endpoint.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1beta1.DeployedModel deployed_model = 1;</code>
     */
    public Builder setDeployedModel(
        com.google.cloud.aiplatform.v1beta1.DeployedModel.Builder builderForValue) {
      if (deployedModelBuilder_ == null) {
        deployedModel_ = builderForValue.build();
        onChanged();
      } else {
        deployedModelBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The DeployedModel that had been deployed in the Endpoint.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1beta1.DeployedModel deployed_model = 1;</code>
     */
    public Builder mergeDeployedModel(com.google.cloud.aiplatform.v1beta1.DeployedModel value) {
      if (deployedModelBuilder_ == null) {
        if (deployedModel_ != null) {
          deployedModel_ =
              com.google.cloud.aiplatform.v1beta1.DeployedModel.newBuilder(deployedModel_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          deployedModel_ = value;
        }
        onChanged();
      } else {
        deployedModelBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The DeployedModel that had been deployed in the Endpoint.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1beta1.DeployedModel deployed_model = 1;</code>
     */
    public Builder clearDeployedModel() {
      if (deployedModelBuilder_ == null) {
        deployedModel_ = null;
        onChanged();
      } else {
        deployedModel_ = null;
        deployedModelBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The DeployedModel that had been deployed in the Endpoint.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1beta1.DeployedModel deployed_model = 1;</code>
     */
    public com.google.cloud.aiplatform.v1beta1.DeployedModel.Builder getDeployedModelBuilder() {

      onChanged();
      return getDeployedModelFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * The DeployedModel that had been deployed in the Endpoint.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1beta1.DeployedModel deployed_model = 1;</code>
     */
    public com.google.cloud.aiplatform.v1beta1.DeployedModelOrBuilder getDeployedModelOrBuilder() {
      if (deployedModelBuilder_ != null) {
        return deployedModelBuilder_.getMessageOrBuilder();
      } else {
        return deployedModel_ == null
            ? com.google.cloud.aiplatform.v1beta1.DeployedModel.getDefaultInstance()
            : deployedModel_;
      }
    }
    /**
     *
     *
     * <pre>
     * The DeployedModel that had been deployed in the Endpoint.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1beta1.DeployedModel deployed_model = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.aiplatform.v1beta1.DeployedModel,
            com.google.cloud.aiplatform.v1beta1.DeployedModel.Builder,
            com.google.cloud.aiplatform.v1beta1.DeployedModelOrBuilder>
        getDeployedModelFieldBuilder() {
      if (deployedModelBuilder_ == null) {
        deployedModelBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.aiplatform.v1beta1.DeployedModel,
                com.google.cloud.aiplatform.v1beta1.DeployedModel.Builder,
                com.google.cloud.aiplatform.v1beta1.DeployedModelOrBuilder>(
                getDeployedModel(), getParentForChildren(), isClean());
        deployedModel_ = null;
      }
      return deployedModelBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.aiplatform.v1beta1.DeployModelResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.aiplatform.v1beta1.DeployModelResponse)
  private static final com.google.cloud.aiplatform.v1beta1.DeployModelResponse DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.aiplatform.v1beta1.DeployModelResponse();
  }

  public static com.google.cloud.aiplatform.v1beta1.DeployModelResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DeployModelResponse> PARSER =
      new com.google.protobuf.AbstractParser<DeployModelResponse>() {
        @java.lang.Override
        public DeployModelResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<DeployModelResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DeployModelResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.aiplatform.v1beta1.DeployModelResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
