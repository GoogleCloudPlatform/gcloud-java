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
// source: google/apps/events/subscriptions/v1/subscriptions_service.proto

// Protobuf Java Version: 3.25.3
package com.google.apps.events.subscriptions.v1;

/**
 *
 *
 * <pre>
 * Metadata for DeleteSubscription LRO.
 * </pre>
 *
 * Protobuf type {@code google.apps.events.subscriptions.v1.DeleteSubscriptionMetadata}
 */
public final class DeleteSubscriptionMetadata extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.apps.events.subscriptions.v1.DeleteSubscriptionMetadata)
    DeleteSubscriptionMetadataOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use DeleteSubscriptionMetadata.newBuilder() to construct.
  private DeleteSubscriptionMetadata(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private DeleteSubscriptionMetadata() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new DeleteSubscriptionMetadata();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.apps.events.subscriptions.v1.SubscriptionsServiceProto
        .internal_static_google_apps_events_subscriptions_v1_DeleteSubscriptionMetadata_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.apps.events.subscriptions.v1.SubscriptionsServiceProto
        .internal_static_google_apps_events_subscriptions_v1_DeleteSubscriptionMetadata_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.apps.events.subscriptions.v1.DeleteSubscriptionMetadata.class,
            com.google.apps.events.subscriptions.v1.DeleteSubscriptionMetadata.Builder.class);
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
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof com.google.apps.events.subscriptions.v1.DeleteSubscriptionMetadata)) {
      return super.equals(obj);
    }
    com.google.apps.events.subscriptions.v1.DeleteSubscriptionMetadata other =
        (com.google.apps.events.subscriptions.v1.DeleteSubscriptionMetadata) obj;

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
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.apps.events.subscriptions.v1.DeleteSubscriptionMetadata parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.apps.events.subscriptions.v1.DeleteSubscriptionMetadata parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.apps.events.subscriptions.v1.DeleteSubscriptionMetadata parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.apps.events.subscriptions.v1.DeleteSubscriptionMetadata parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.apps.events.subscriptions.v1.DeleteSubscriptionMetadata parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.apps.events.subscriptions.v1.DeleteSubscriptionMetadata parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.apps.events.subscriptions.v1.DeleteSubscriptionMetadata parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.apps.events.subscriptions.v1.DeleteSubscriptionMetadata parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.apps.events.subscriptions.v1.DeleteSubscriptionMetadata
      parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.apps.events.subscriptions.v1.DeleteSubscriptionMetadata
      parseDelimitedFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.apps.events.subscriptions.v1.DeleteSubscriptionMetadata parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.apps.events.subscriptions.v1.DeleteSubscriptionMetadata parseFrom(
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
      com.google.apps.events.subscriptions.v1.DeleteSubscriptionMetadata prototype) {
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
   * Metadata for DeleteSubscription LRO.
   * </pre>
   *
   * Protobuf type {@code google.apps.events.subscriptions.v1.DeleteSubscriptionMetadata}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.apps.events.subscriptions.v1.DeleteSubscriptionMetadata)
      com.google.apps.events.subscriptions.v1.DeleteSubscriptionMetadataOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.apps.events.subscriptions.v1.SubscriptionsServiceProto
          .internal_static_google_apps_events_subscriptions_v1_DeleteSubscriptionMetadata_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.apps.events.subscriptions.v1.SubscriptionsServiceProto
          .internal_static_google_apps_events_subscriptions_v1_DeleteSubscriptionMetadata_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.apps.events.subscriptions.v1.DeleteSubscriptionMetadata.class,
              com.google.apps.events.subscriptions.v1.DeleteSubscriptionMetadata.Builder.class);
    }

    // Construct using
    // com.google.apps.events.subscriptions.v1.DeleteSubscriptionMetadata.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.apps.events.subscriptions.v1.SubscriptionsServiceProto
          .internal_static_google_apps_events_subscriptions_v1_DeleteSubscriptionMetadata_descriptor;
    }

    @java.lang.Override
    public com.google.apps.events.subscriptions.v1.DeleteSubscriptionMetadata
        getDefaultInstanceForType() {
      return com.google.apps.events.subscriptions.v1.DeleteSubscriptionMetadata
          .getDefaultInstance();
    }

    @java.lang.Override
    public com.google.apps.events.subscriptions.v1.DeleteSubscriptionMetadata build() {
      com.google.apps.events.subscriptions.v1.DeleteSubscriptionMetadata result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.apps.events.subscriptions.v1.DeleteSubscriptionMetadata buildPartial() {
      com.google.apps.events.subscriptions.v1.DeleteSubscriptionMetadata result =
          new com.google.apps.events.subscriptions.v1.DeleteSubscriptionMetadata(this);
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
      if (other instanceof com.google.apps.events.subscriptions.v1.DeleteSubscriptionMetadata) {
        return mergeFrom(
            (com.google.apps.events.subscriptions.v1.DeleteSubscriptionMetadata) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.apps.events.subscriptions.v1.DeleteSubscriptionMetadata other) {
      if (other
          == com.google.apps.events.subscriptions.v1.DeleteSubscriptionMetadata
              .getDefaultInstance()) return this;
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

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.apps.events.subscriptions.v1.DeleteSubscriptionMetadata)
  }

  // @@protoc_insertion_point(class_scope:google.apps.events.subscriptions.v1.DeleteSubscriptionMetadata)
  private static final com.google.apps.events.subscriptions.v1.DeleteSubscriptionMetadata
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.apps.events.subscriptions.v1.DeleteSubscriptionMetadata();
  }

  public static com.google.apps.events.subscriptions.v1.DeleteSubscriptionMetadata
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DeleteSubscriptionMetadata> PARSER =
      new com.google.protobuf.AbstractParser<DeleteSubscriptionMetadata>() {
        @java.lang.Override
        public DeleteSubscriptionMetadata parsePartialFrom(
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

  public static com.google.protobuf.Parser<DeleteSubscriptionMetadata> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DeleteSubscriptionMetadata> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.apps.events.subscriptions.v1.DeleteSubscriptionMetadata
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
