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
// source: google/apps/events/subscriptions/v1/subscription_resource.proto

// Protobuf Java Version: 3.25.3
package com.google.apps.events.subscriptions.v1;

/**
 *
 *
 * <pre>
 * The endpoint where the subscription delivers events.
 * </pre>
 *
 * Protobuf type {@code google.apps.events.subscriptions.v1.NotificationEndpoint}
 */
public final class NotificationEndpoint extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.apps.events.subscriptions.v1.NotificationEndpoint)
    NotificationEndpointOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use NotificationEndpoint.newBuilder() to construct.
  private NotificationEndpoint(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private NotificationEndpoint() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new NotificationEndpoint();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.apps.events.subscriptions.v1.SubscriptionResourceProto
        .internal_static_google_apps_events_subscriptions_v1_NotificationEndpoint_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.apps.events.subscriptions.v1.SubscriptionResourceProto
        .internal_static_google_apps_events_subscriptions_v1_NotificationEndpoint_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.apps.events.subscriptions.v1.NotificationEndpoint.class,
            com.google.apps.events.subscriptions.v1.NotificationEndpoint.Builder.class);
  }

  private int endpointCase_ = 0;

  @SuppressWarnings("serial")
  private java.lang.Object endpoint_;

  public enum EndpointCase
      implements
          com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    PUBSUB_TOPIC(1),
    ENDPOINT_NOT_SET(0);
    private final int value;

    private EndpointCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static EndpointCase valueOf(int value) {
      return forNumber(value);
    }

    public static EndpointCase forNumber(int value) {
      switch (value) {
        case 1:
          return PUBSUB_TOPIC;
        case 0:
          return ENDPOINT_NOT_SET;
        default:
          return null;
      }
    }

    public int getNumber() {
      return this.value;
    }
  };

  public EndpointCase getEndpointCase() {
    return EndpointCase.forNumber(endpointCase_);
  }

  public static final int PUBSUB_TOPIC_FIELD_NUMBER = 1;
  /**
   *
   *
   * <pre>
   * Immutable. The Cloud Pub/Sub topic that receives events for the
   * subscription.
   *
   * Format: `projects/{project}/topics/{topic}`
   *
   *
   * You must create the topic in the same Google Cloud project where
   * you create this subscription.
   *
   * When the topic receives events, the events are encoded as Cloud Pub/Sub
   * messages. For details, see the [Google Cloud Pub/Sub Protocol Binding for
   * CloudEvents](https://github.com/googleapis/google-cloudevents/blob/main/docs/spec/pubsub.md).
   * </pre>
   *
   * <code>
   * string pubsub_topic = 1 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return Whether the pubsubTopic field is set.
   */
  public boolean hasPubsubTopic() {
    return endpointCase_ == 1;
  }
  /**
   *
   *
   * <pre>
   * Immutable. The Cloud Pub/Sub topic that receives events for the
   * subscription.
   *
   * Format: `projects/{project}/topics/{topic}`
   *
   *
   * You must create the topic in the same Google Cloud project where
   * you create this subscription.
   *
   * When the topic receives events, the events are encoded as Cloud Pub/Sub
   * messages. For details, see the [Google Cloud Pub/Sub Protocol Binding for
   * CloudEvents](https://github.com/googleapis/google-cloudevents/blob/main/docs/spec/pubsub.md).
   * </pre>
   *
   * <code>
   * string pubsub_topic = 1 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The pubsubTopic.
   */
  public java.lang.String getPubsubTopic() {
    java.lang.Object ref = "";
    if (endpointCase_ == 1) {
      ref = endpoint_;
    }
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (endpointCase_ == 1) {
        endpoint_ = s;
      }
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Immutable. The Cloud Pub/Sub topic that receives events for the
   * subscription.
   *
   * Format: `projects/{project}/topics/{topic}`
   *
   *
   * You must create the topic in the same Google Cloud project where
   * you create this subscription.
   *
   * When the topic receives events, the events are encoded as Cloud Pub/Sub
   * messages. For details, see the [Google Cloud Pub/Sub Protocol Binding for
   * CloudEvents](https://github.com/googleapis/google-cloudevents/blob/main/docs/spec/pubsub.md).
   * </pre>
   *
   * <code>
   * string pubsub_topic = 1 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for pubsubTopic.
   */
  public com.google.protobuf.ByteString getPubsubTopicBytes() {
    java.lang.Object ref = "";
    if (endpointCase_ == 1) {
      ref = endpoint_;
    }
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      if (endpointCase_ == 1) {
        endpoint_ = b;
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
    if (endpointCase_ == 1) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, endpoint_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (endpointCase_ == 1) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, endpoint_);
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
    if (!(obj instanceof com.google.apps.events.subscriptions.v1.NotificationEndpoint)) {
      return super.equals(obj);
    }
    com.google.apps.events.subscriptions.v1.NotificationEndpoint other =
        (com.google.apps.events.subscriptions.v1.NotificationEndpoint) obj;

    if (!getEndpointCase().equals(other.getEndpointCase())) return false;
    switch (endpointCase_) {
      case 1:
        if (!getPubsubTopic().equals(other.getPubsubTopic())) return false;
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
    switch (endpointCase_) {
      case 1:
        hash = (37 * hash) + PUBSUB_TOPIC_FIELD_NUMBER;
        hash = (53 * hash) + getPubsubTopic().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.apps.events.subscriptions.v1.NotificationEndpoint parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.apps.events.subscriptions.v1.NotificationEndpoint parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.apps.events.subscriptions.v1.NotificationEndpoint parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.apps.events.subscriptions.v1.NotificationEndpoint parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.apps.events.subscriptions.v1.NotificationEndpoint parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.apps.events.subscriptions.v1.NotificationEndpoint parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.apps.events.subscriptions.v1.NotificationEndpoint parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.apps.events.subscriptions.v1.NotificationEndpoint parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.apps.events.subscriptions.v1.NotificationEndpoint parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.apps.events.subscriptions.v1.NotificationEndpoint parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.apps.events.subscriptions.v1.NotificationEndpoint parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.apps.events.subscriptions.v1.NotificationEndpoint parseFrom(
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
      com.google.apps.events.subscriptions.v1.NotificationEndpoint prototype) {
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
   * The endpoint where the subscription delivers events.
   * </pre>
   *
   * Protobuf type {@code google.apps.events.subscriptions.v1.NotificationEndpoint}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.apps.events.subscriptions.v1.NotificationEndpoint)
      com.google.apps.events.subscriptions.v1.NotificationEndpointOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.apps.events.subscriptions.v1.SubscriptionResourceProto
          .internal_static_google_apps_events_subscriptions_v1_NotificationEndpoint_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.apps.events.subscriptions.v1.SubscriptionResourceProto
          .internal_static_google_apps_events_subscriptions_v1_NotificationEndpoint_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.apps.events.subscriptions.v1.NotificationEndpoint.class,
              com.google.apps.events.subscriptions.v1.NotificationEndpoint.Builder.class);
    }

    // Construct using com.google.apps.events.subscriptions.v1.NotificationEndpoint.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      endpointCase_ = 0;
      endpoint_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.apps.events.subscriptions.v1.SubscriptionResourceProto
          .internal_static_google_apps_events_subscriptions_v1_NotificationEndpoint_descriptor;
    }

    @java.lang.Override
    public com.google.apps.events.subscriptions.v1.NotificationEndpoint
        getDefaultInstanceForType() {
      return com.google.apps.events.subscriptions.v1.NotificationEndpoint.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.apps.events.subscriptions.v1.NotificationEndpoint build() {
      com.google.apps.events.subscriptions.v1.NotificationEndpoint result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.apps.events.subscriptions.v1.NotificationEndpoint buildPartial() {
      com.google.apps.events.subscriptions.v1.NotificationEndpoint result =
          new com.google.apps.events.subscriptions.v1.NotificationEndpoint(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      buildPartialOneofs(result);
      onBuilt();
      return result;
    }

    private void buildPartial0(
        com.google.apps.events.subscriptions.v1.NotificationEndpoint result) {
      int from_bitField0_ = bitField0_;
    }

    private void buildPartialOneofs(
        com.google.apps.events.subscriptions.v1.NotificationEndpoint result) {
      result.endpointCase_ = endpointCase_;
      result.endpoint_ = this.endpoint_;
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
      if (other instanceof com.google.apps.events.subscriptions.v1.NotificationEndpoint) {
        return mergeFrom((com.google.apps.events.subscriptions.v1.NotificationEndpoint) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.apps.events.subscriptions.v1.NotificationEndpoint other) {
      if (other
          == com.google.apps.events.subscriptions.v1.NotificationEndpoint.getDefaultInstance())
        return this;
      switch (other.getEndpointCase()) {
        case PUBSUB_TOPIC:
          {
            endpointCase_ = 1;
            endpoint_ = other.endpoint_;
            onChanged();
            break;
          }
        case ENDPOINT_NOT_SET:
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
                endpointCase_ = 1;
                endpoint_ = s;
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

    private int endpointCase_ = 0;
    private java.lang.Object endpoint_;

    public EndpointCase getEndpointCase() {
      return EndpointCase.forNumber(endpointCase_);
    }

    public Builder clearEndpoint() {
      endpointCase_ = 0;
      endpoint_ = null;
      onChanged();
      return this;
    }

    private int bitField0_;

    /**
     *
     *
     * <pre>
     * Immutable. The Cloud Pub/Sub topic that receives events for the
     * subscription.
     *
     * Format: `projects/{project}/topics/{topic}`
     *
     *
     * You must create the topic in the same Google Cloud project where
     * you create this subscription.
     *
     * When the topic receives events, the events are encoded as Cloud Pub/Sub
     * messages. For details, see the [Google Cloud Pub/Sub Protocol Binding for
     * CloudEvents](https://github.com/googleapis/google-cloudevents/blob/main/docs/spec/pubsub.md).
     * </pre>
     *
     * <code>
     * string pubsub_topic = 1 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return Whether the pubsubTopic field is set.
     */
    @java.lang.Override
    public boolean hasPubsubTopic() {
      return endpointCase_ == 1;
    }
    /**
     *
     *
     * <pre>
     * Immutable. The Cloud Pub/Sub topic that receives events for the
     * subscription.
     *
     * Format: `projects/{project}/topics/{topic}`
     *
     *
     * You must create the topic in the same Google Cloud project where
     * you create this subscription.
     *
     * When the topic receives events, the events are encoded as Cloud Pub/Sub
     * messages. For details, see the [Google Cloud Pub/Sub Protocol Binding for
     * CloudEvents](https://github.com/googleapis/google-cloudevents/blob/main/docs/spec/pubsub.md).
     * </pre>
     *
     * <code>
     * string pubsub_topic = 1 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The pubsubTopic.
     */
    @java.lang.Override
    public java.lang.String getPubsubTopic() {
      java.lang.Object ref = "";
      if (endpointCase_ == 1) {
        ref = endpoint_;
      }
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (endpointCase_ == 1) {
          endpoint_ = s;
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
     * Immutable. The Cloud Pub/Sub topic that receives events for the
     * subscription.
     *
     * Format: `projects/{project}/topics/{topic}`
     *
     *
     * You must create the topic in the same Google Cloud project where
     * you create this subscription.
     *
     * When the topic receives events, the events are encoded as Cloud Pub/Sub
     * messages. For details, see the [Google Cloud Pub/Sub Protocol Binding for
     * CloudEvents](https://github.com/googleapis/google-cloudevents/blob/main/docs/spec/pubsub.md).
     * </pre>
     *
     * <code>
     * string pubsub_topic = 1 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The bytes for pubsubTopic.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getPubsubTopicBytes() {
      java.lang.Object ref = "";
      if (endpointCase_ == 1) {
        ref = endpoint_;
      }
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        if (endpointCase_ == 1) {
          endpoint_ = b;
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
     * Immutable. The Cloud Pub/Sub topic that receives events for the
     * subscription.
     *
     * Format: `projects/{project}/topics/{topic}`
     *
     *
     * You must create the topic in the same Google Cloud project where
     * you create this subscription.
     *
     * When the topic receives events, the events are encoded as Cloud Pub/Sub
     * messages. For details, see the [Google Cloud Pub/Sub Protocol Binding for
     * CloudEvents](https://github.com/googleapis/google-cloudevents/blob/main/docs/spec/pubsub.md).
     * </pre>
     *
     * <code>
     * string pubsub_topic = 1 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The pubsubTopic to set.
     * @return This builder for chaining.
     */
    public Builder setPubsubTopic(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      endpointCase_ = 1;
      endpoint_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Immutable. The Cloud Pub/Sub topic that receives events for the
     * subscription.
     *
     * Format: `projects/{project}/topics/{topic}`
     *
     *
     * You must create the topic in the same Google Cloud project where
     * you create this subscription.
     *
     * When the topic receives events, the events are encoded as Cloud Pub/Sub
     * messages. For details, see the [Google Cloud Pub/Sub Protocol Binding for
     * CloudEvents](https://github.com/googleapis/google-cloudevents/blob/main/docs/spec/pubsub.md).
     * </pre>
     *
     * <code>
     * string pubsub_topic = 1 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearPubsubTopic() {
      if (endpointCase_ == 1) {
        endpointCase_ = 0;
        endpoint_ = null;
        onChanged();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Immutable. The Cloud Pub/Sub topic that receives events for the
     * subscription.
     *
     * Format: `projects/{project}/topics/{topic}`
     *
     *
     * You must create the topic in the same Google Cloud project where
     * you create this subscription.
     *
     * When the topic receives events, the events are encoded as Cloud Pub/Sub
     * messages. For details, see the [Google Cloud Pub/Sub Protocol Binding for
     * CloudEvents](https://github.com/googleapis/google-cloudevents/blob/main/docs/spec/pubsub.md).
     * </pre>
     *
     * <code>
     * string pubsub_topic = 1 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The bytes for pubsubTopic to set.
     * @return This builder for chaining.
     */
    public Builder setPubsubTopicBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      endpointCase_ = 1;
      endpoint_ = value;
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

    // @@protoc_insertion_point(builder_scope:google.apps.events.subscriptions.v1.NotificationEndpoint)
  }

  // @@protoc_insertion_point(class_scope:google.apps.events.subscriptions.v1.NotificationEndpoint)
  private static final com.google.apps.events.subscriptions.v1.NotificationEndpoint
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.apps.events.subscriptions.v1.NotificationEndpoint();
  }

  public static com.google.apps.events.subscriptions.v1.NotificationEndpoint getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<NotificationEndpoint> PARSER =
      new com.google.protobuf.AbstractParser<NotificationEndpoint>() {
        @java.lang.Override
        public NotificationEndpoint parsePartialFrom(
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

  public static com.google.protobuf.Parser<NotificationEndpoint> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<NotificationEndpoint> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.apps.events.subscriptions.v1.NotificationEndpoint getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
