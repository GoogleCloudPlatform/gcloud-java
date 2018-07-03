// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/pubsub/v1/pubsub.proto

package com.google.pubsub.v1;

/**
 * <pre>
 * Request for the ModifyPushConfig method.
 * </pre>
 *
 * Protobuf type {@code google.pubsub.v1.ModifyPushConfigRequest}
 */
public  final class ModifyPushConfigRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.pubsub.v1.ModifyPushConfigRequest)
    ModifyPushConfigRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ModifyPushConfigRequest.newBuilder() to construct.
  private ModifyPushConfigRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ModifyPushConfigRequest() {
    subscription_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ModifyPushConfigRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
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
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            subscription_ = s;
            break;
          }
          case 18: {
            com.google.pubsub.v1.PushConfig.Builder subBuilder = null;
            if (pushConfig_ != null) {
              subBuilder = pushConfig_.toBuilder();
            }
            pushConfig_ = input.readMessage(com.google.pubsub.v1.PushConfig.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(pushConfig_);
              pushConfig_ = subBuilder.buildPartial();
            }

            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.pubsub.v1.PubsubProto.internal_static_google_pubsub_v1_ModifyPushConfigRequest_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.pubsub.v1.PubsubProto.internal_static_google_pubsub_v1_ModifyPushConfigRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.pubsub.v1.ModifyPushConfigRequest.class, com.google.pubsub.v1.ModifyPushConfigRequest.Builder.class);
  }

  public static final int SUBSCRIPTION_FIELD_NUMBER = 1;
  private volatile java.lang.Object subscription_;
  /**
   * <pre>
   * The name of the subscription.
   * Format is `projects/{project}/subscriptions/{sub}`.
   * </pre>
   *
   * <code>string subscription = 1;</code>
   */
  public java.lang.String getSubscription() {
    java.lang.Object ref = subscription_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      subscription_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The name of the subscription.
   * Format is `projects/{project}/subscriptions/{sub}`.
   * </pre>
   *
   * <code>string subscription = 1;</code>
   */
  public com.google.protobuf.ByteString
      getSubscriptionBytes() {
    java.lang.Object ref = subscription_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      subscription_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PUSH_CONFIG_FIELD_NUMBER = 2;
  private com.google.pubsub.v1.PushConfig pushConfig_;
  /**
   * <pre>
   * The push configuration for future deliveries.
   * An empty `pushConfig` indicates that the Pub/Sub system should
   * stop pushing messages from the given subscription and allow
   * messages to be pulled and acknowledged - effectively pausing
   * the subscription if `Pull` or `StreamingPull` is not called.
   * </pre>
   *
   * <code>.google.pubsub.v1.PushConfig push_config = 2;</code>
   */
  public boolean hasPushConfig() {
    return pushConfig_ != null;
  }
  /**
   * <pre>
   * The push configuration for future deliveries.
   * An empty `pushConfig` indicates that the Pub/Sub system should
   * stop pushing messages from the given subscription and allow
   * messages to be pulled and acknowledged - effectively pausing
   * the subscription if `Pull` or `StreamingPull` is not called.
   * </pre>
   *
   * <code>.google.pubsub.v1.PushConfig push_config = 2;</code>
   */
  public com.google.pubsub.v1.PushConfig getPushConfig() {
    return pushConfig_ == null ? com.google.pubsub.v1.PushConfig.getDefaultInstance() : pushConfig_;
  }
  /**
   * <pre>
   * The push configuration for future deliveries.
   * An empty `pushConfig` indicates that the Pub/Sub system should
   * stop pushing messages from the given subscription and allow
   * messages to be pulled and acknowledged - effectively pausing
   * the subscription if `Pull` or `StreamingPull` is not called.
   * </pre>
   *
   * <code>.google.pubsub.v1.PushConfig push_config = 2;</code>
   */
  public com.google.pubsub.v1.PushConfigOrBuilder getPushConfigOrBuilder() {
    return getPushConfig();
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getSubscriptionBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, subscription_);
    }
    if (pushConfig_ != null) {
      output.writeMessage(2, getPushConfig());
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getSubscriptionBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, subscription_);
    }
    if (pushConfig_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getPushConfig());
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
    if (!(obj instanceof com.google.pubsub.v1.ModifyPushConfigRequest)) {
      return super.equals(obj);
    }
    com.google.pubsub.v1.ModifyPushConfigRequest other = (com.google.pubsub.v1.ModifyPushConfigRequest) obj;

    boolean result = true;
    result = result && getSubscription()
        .equals(other.getSubscription());
    result = result && (hasPushConfig() == other.hasPushConfig());
    if (hasPushConfig()) {
      result = result && getPushConfig()
          .equals(other.getPushConfig());
    }
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + SUBSCRIPTION_FIELD_NUMBER;
    hash = (53 * hash) + getSubscription().hashCode();
    if (hasPushConfig()) {
      hash = (37 * hash) + PUSH_CONFIG_FIELD_NUMBER;
      hash = (53 * hash) + getPushConfig().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.pubsub.v1.ModifyPushConfigRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.pubsub.v1.ModifyPushConfigRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.pubsub.v1.ModifyPushConfigRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.pubsub.v1.ModifyPushConfigRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.pubsub.v1.ModifyPushConfigRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.pubsub.v1.ModifyPushConfigRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.pubsub.v1.ModifyPushConfigRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.pubsub.v1.ModifyPushConfigRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.pubsub.v1.ModifyPushConfigRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.pubsub.v1.ModifyPushConfigRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.pubsub.v1.ModifyPushConfigRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.pubsub.v1.ModifyPushConfigRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.google.pubsub.v1.ModifyPushConfigRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * Request for the ModifyPushConfig method.
   * </pre>
   *
   * Protobuf type {@code google.pubsub.v1.ModifyPushConfigRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.pubsub.v1.ModifyPushConfigRequest)
      com.google.pubsub.v1.ModifyPushConfigRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.pubsub.v1.PubsubProto.internal_static_google_pubsub_v1_ModifyPushConfigRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.pubsub.v1.PubsubProto.internal_static_google_pubsub_v1_ModifyPushConfigRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.pubsub.v1.ModifyPushConfigRequest.class, com.google.pubsub.v1.ModifyPushConfigRequest.Builder.class);
    }

    // Construct using com.google.pubsub.v1.ModifyPushConfigRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    public Builder clear() {
      super.clear();
      subscription_ = "";

      if (pushConfigBuilder_ == null) {
        pushConfig_ = null;
      } else {
        pushConfig_ = null;
        pushConfigBuilder_ = null;
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.pubsub.v1.PubsubProto.internal_static_google_pubsub_v1_ModifyPushConfigRequest_descriptor;
    }

    public com.google.pubsub.v1.ModifyPushConfigRequest getDefaultInstanceForType() {
      return com.google.pubsub.v1.ModifyPushConfigRequest.getDefaultInstance();
    }

    public com.google.pubsub.v1.ModifyPushConfigRequest build() {
      com.google.pubsub.v1.ModifyPushConfigRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.google.pubsub.v1.ModifyPushConfigRequest buildPartial() {
      com.google.pubsub.v1.ModifyPushConfigRequest result = new com.google.pubsub.v1.ModifyPushConfigRequest(this);
      result.subscription_ = subscription_;
      if (pushConfigBuilder_ == null) {
        result.pushConfig_ = pushConfig_;
      } else {
        result.pushConfig_ = pushConfigBuilder_.build();
      }
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.pubsub.v1.ModifyPushConfigRequest) {
        return mergeFrom((com.google.pubsub.v1.ModifyPushConfigRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.pubsub.v1.ModifyPushConfigRequest other) {
      if (other == com.google.pubsub.v1.ModifyPushConfigRequest.getDefaultInstance()) return this;
      if (!other.getSubscription().isEmpty()) {
        subscription_ = other.subscription_;
        onChanged();
      }
      if (other.hasPushConfig()) {
        mergePushConfig(other.getPushConfig());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.google.pubsub.v1.ModifyPushConfigRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.pubsub.v1.ModifyPushConfigRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object subscription_ = "";
    /**
     * <pre>
     * The name of the subscription.
     * Format is `projects/{project}/subscriptions/{sub}`.
     * </pre>
     *
     * <code>string subscription = 1;</code>
     */
    public java.lang.String getSubscription() {
      java.lang.Object ref = subscription_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        subscription_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The name of the subscription.
     * Format is `projects/{project}/subscriptions/{sub}`.
     * </pre>
     *
     * <code>string subscription = 1;</code>
     */
    public com.google.protobuf.ByteString
        getSubscriptionBytes() {
      java.lang.Object ref = subscription_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        subscription_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The name of the subscription.
     * Format is `projects/{project}/subscriptions/{sub}`.
     * </pre>
     *
     * <code>string subscription = 1;</code>
     */
    public Builder setSubscription(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      subscription_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The name of the subscription.
     * Format is `projects/{project}/subscriptions/{sub}`.
     * </pre>
     *
     * <code>string subscription = 1;</code>
     */
    public Builder clearSubscription() {
      
      subscription_ = getDefaultInstance().getSubscription();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The name of the subscription.
     * Format is `projects/{project}/subscriptions/{sub}`.
     * </pre>
     *
     * <code>string subscription = 1;</code>
     */
    public Builder setSubscriptionBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      subscription_ = value;
      onChanged();
      return this;
    }

    private com.google.pubsub.v1.PushConfig pushConfig_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.pubsub.v1.PushConfig, com.google.pubsub.v1.PushConfig.Builder, com.google.pubsub.v1.PushConfigOrBuilder> pushConfigBuilder_;
    /**
     * <pre>
     * The push configuration for future deliveries.
     * An empty `pushConfig` indicates that the Pub/Sub system should
     * stop pushing messages from the given subscription and allow
     * messages to be pulled and acknowledged - effectively pausing
     * the subscription if `Pull` or `StreamingPull` is not called.
     * </pre>
     *
     * <code>.google.pubsub.v1.PushConfig push_config = 2;</code>
     */
    public boolean hasPushConfig() {
      return pushConfigBuilder_ != null || pushConfig_ != null;
    }
    /**
     * <pre>
     * The push configuration for future deliveries.
     * An empty `pushConfig` indicates that the Pub/Sub system should
     * stop pushing messages from the given subscription and allow
     * messages to be pulled and acknowledged - effectively pausing
     * the subscription if `Pull` or `StreamingPull` is not called.
     * </pre>
     *
     * <code>.google.pubsub.v1.PushConfig push_config = 2;</code>
     */
    public com.google.pubsub.v1.PushConfig getPushConfig() {
      if (pushConfigBuilder_ == null) {
        return pushConfig_ == null ? com.google.pubsub.v1.PushConfig.getDefaultInstance() : pushConfig_;
      } else {
        return pushConfigBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The push configuration for future deliveries.
     * An empty `pushConfig` indicates that the Pub/Sub system should
     * stop pushing messages from the given subscription and allow
     * messages to be pulled and acknowledged - effectively pausing
     * the subscription if `Pull` or `StreamingPull` is not called.
     * </pre>
     *
     * <code>.google.pubsub.v1.PushConfig push_config = 2;</code>
     */
    public Builder setPushConfig(com.google.pubsub.v1.PushConfig value) {
      if (pushConfigBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        pushConfig_ = value;
        onChanged();
      } else {
        pushConfigBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * The push configuration for future deliveries.
     * An empty `pushConfig` indicates that the Pub/Sub system should
     * stop pushing messages from the given subscription and allow
     * messages to be pulled and acknowledged - effectively pausing
     * the subscription if `Pull` or `StreamingPull` is not called.
     * </pre>
     *
     * <code>.google.pubsub.v1.PushConfig push_config = 2;</code>
     */
    public Builder setPushConfig(
        com.google.pubsub.v1.PushConfig.Builder builderForValue) {
      if (pushConfigBuilder_ == null) {
        pushConfig_ = builderForValue.build();
        onChanged();
      } else {
        pushConfigBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * The push configuration for future deliveries.
     * An empty `pushConfig` indicates that the Pub/Sub system should
     * stop pushing messages from the given subscription and allow
     * messages to be pulled and acknowledged - effectively pausing
     * the subscription if `Pull` or `StreamingPull` is not called.
     * </pre>
     *
     * <code>.google.pubsub.v1.PushConfig push_config = 2;</code>
     */
    public Builder mergePushConfig(com.google.pubsub.v1.PushConfig value) {
      if (pushConfigBuilder_ == null) {
        if (pushConfig_ != null) {
          pushConfig_ =
            com.google.pubsub.v1.PushConfig.newBuilder(pushConfig_).mergeFrom(value).buildPartial();
        } else {
          pushConfig_ = value;
        }
        onChanged();
      } else {
        pushConfigBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * The push configuration for future deliveries.
     * An empty `pushConfig` indicates that the Pub/Sub system should
     * stop pushing messages from the given subscription and allow
     * messages to be pulled and acknowledged - effectively pausing
     * the subscription if `Pull` or `StreamingPull` is not called.
     * </pre>
     *
     * <code>.google.pubsub.v1.PushConfig push_config = 2;</code>
     */
    public Builder clearPushConfig() {
      if (pushConfigBuilder_ == null) {
        pushConfig_ = null;
        onChanged();
      } else {
        pushConfig_ = null;
        pushConfigBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * The push configuration for future deliveries.
     * An empty `pushConfig` indicates that the Pub/Sub system should
     * stop pushing messages from the given subscription and allow
     * messages to be pulled and acknowledged - effectively pausing
     * the subscription if `Pull` or `StreamingPull` is not called.
     * </pre>
     *
     * <code>.google.pubsub.v1.PushConfig push_config = 2;</code>
     */
    public com.google.pubsub.v1.PushConfig.Builder getPushConfigBuilder() {
      
      onChanged();
      return getPushConfigFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The push configuration for future deliveries.
     * An empty `pushConfig` indicates that the Pub/Sub system should
     * stop pushing messages from the given subscription and allow
     * messages to be pulled and acknowledged - effectively pausing
     * the subscription if `Pull` or `StreamingPull` is not called.
     * </pre>
     *
     * <code>.google.pubsub.v1.PushConfig push_config = 2;</code>
     */
    public com.google.pubsub.v1.PushConfigOrBuilder getPushConfigOrBuilder() {
      if (pushConfigBuilder_ != null) {
        return pushConfigBuilder_.getMessageOrBuilder();
      } else {
        return pushConfig_ == null ?
            com.google.pubsub.v1.PushConfig.getDefaultInstance() : pushConfig_;
      }
    }
    /**
     * <pre>
     * The push configuration for future deliveries.
     * An empty `pushConfig` indicates that the Pub/Sub system should
     * stop pushing messages from the given subscription and allow
     * messages to be pulled and acknowledged - effectively pausing
     * the subscription if `Pull` or `StreamingPull` is not called.
     * </pre>
     *
     * <code>.google.pubsub.v1.PushConfig push_config = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.pubsub.v1.PushConfig, com.google.pubsub.v1.PushConfig.Builder, com.google.pubsub.v1.PushConfigOrBuilder> 
        getPushConfigFieldBuilder() {
      if (pushConfigBuilder_ == null) {
        pushConfigBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.pubsub.v1.PushConfig, com.google.pubsub.v1.PushConfig.Builder, com.google.pubsub.v1.PushConfigOrBuilder>(
                getPushConfig(),
                getParentForChildren(),
                isClean());
        pushConfig_ = null;
      }
      return pushConfigBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:google.pubsub.v1.ModifyPushConfigRequest)
  }

  // @@protoc_insertion_point(class_scope:google.pubsub.v1.ModifyPushConfigRequest)
  private static final com.google.pubsub.v1.ModifyPushConfigRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.pubsub.v1.ModifyPushConfigRequest();
  }

  public static com.google.pubsub.v1.ModifyPushConfigRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ModifyPushConfigRequest>
      PARSER = new com.google.protobuf.AbstractParser<ModifyPushConfigRequest>() {
    public ModifyPushConfigRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ModifyPushConfigRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ModifyPushConfigRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ModifyPushConfigRequest> getParserForType() {
    return PARSER;
  }

  public com.google.pubsub.v1.ModifyPushConfigRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

