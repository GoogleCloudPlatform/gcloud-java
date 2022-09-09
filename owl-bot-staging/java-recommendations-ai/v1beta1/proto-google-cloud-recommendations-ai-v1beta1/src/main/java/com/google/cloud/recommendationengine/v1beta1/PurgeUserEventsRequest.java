// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/recommendationengine/v1beta1/user_event_service.proto

package com.google.cloud.recommendationengine.v1beta1;

/**
 * <pre>
 * Request message for PurgeUserEvents method.
 * </pre>
 *
 * Protobuf type {@code google.cloud.recommendationengine.v1beta1.PurgeUserEventsRequest}
 */
public final class PurgeUserEventsRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.recommendationengine.v1beta1.PurgeUserEventsRequest)
    PurgeUserEventsRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PurgeUserEventsRequest.newBuilder() to construct.
  private PurgeUserEventsRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PurgeUserEventsRequest() {
    parent_ = "";
    filter_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new PurgeUserEventsRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private PurgeUserEventsRequest(
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
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            parent_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            filter_ = s;
            break;
          }
          case 24: {

            force_ = input.readBool();
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
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
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.recommendationengine.v1beta1.UserEventServiceOuterClass.internal_static_google_cloud_recommendationengine_v1beta1_PurgeUserEventsRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.recommendationengine.v1beta1.UserEventServiceOuterClass.internal_static_google_cloud_recommendationengine_v1beta1_PurgeUserEventsRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.recommendationengine.v1beta1.PurgeUserEventsRequest.class, com.google.cloud.recommendationengine.v1beta1.PurgeUserEventsRequest.Builder.class);
  }

  public static final int PARENT_FIELD_NUMBER = 1;
  private volatile java.lang.Object parent_;
  /**
   * <pre>
   * Required. The resource name of the event_store under which the events are
   * created. The format is
   * `projects/${projectId}/locations/global/catalogs/${catalogId}/eventStores/${eventStoreId}`
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The parent.
   */
  @java.lang.Override
  public java.lang.String getParent() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      parent_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Required. The resource name of the event_store under which the events are
   * created. The format is
   * `projects/${projectId}/locations/global/catalogs/${catalogId}/eventStores/${eventStoreId}`
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for parent.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getParentBytes() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      parent_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int FILTER_FIELD_NUMBER = 2;
  private volatile java.lang.Object filter_;
  /**
   * <pre>
   * Required. The filter string to specify the events to be deleted. Empty
   * string filter is not allowed. This filter can also be used with
   * ListUserEvents API to list events that will be deleted. The eligible fields
   * for filtering are:
   * * eventType - UserEvent.eventType field of type string.
   * * eventTime - in ISO 8601 "zulu" format.
   * * visitorId - field of type string. Specifying this will delete all events
   * associated with a visitor.
   * * userId - field of type string. Specifying this will delete all events
   * associated with a user.
   * Example 1: Deleting all events in a time range.
   * `eventTime &gt; "2012-04-23T18:25:43.511Z" eventTime &lt;
   * "2012-04-23T18:30:43.511Z"`
   * Example 2: Deleting specific eventType in time range.
   * `eventTime &gt; "2012-04-23T18:25:43.511Z" eventType = "detail-page-view"`
   * Example 3: Deleting all events for a specific visitor
   * `visitorId = visitor1024`
   * The filtering fields are assumed to have an implicit AND.
   * </pre>
   *
   * <code>string filter = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The filter.
   */
  @java.lang.Override
  public java.lang.String getFilter() {
    java.lang.Object ref = filter_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      filter_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Required. The filter string to specify the events to be deleted. Empty
   * string filter is not allowed. This filter can also be used with
   * ListUserEvents API to list events that will be deleted. The eligible fields
   * for filtering are:
   * * eventType - UserEvent.eventType field of type string.
   * * eventTime - in ISO 8601 "zulu" format.
   * * visitorId - field of type string. Specifying this will delete all events
   * associated with a visitor.
   * * userId - field of type string. Specifying this will delete all events
   * associated with a user.
   * Example 1: Deleting all events in a time range.
   * `eventTime &gt; "2012-04-23T18:25:43.511Z" eventTime &lt;
   * "2012-04-23T18:30:43.511Z"`
   * Example 2: Deleting specific eventType in time range.
   * `eventTime &gt; "2012-04-23T18:25:43.511Z" eventType = "detail-page-view"`
   * Example 3: Deleting all events for a specific visitor
   * `visitorId = visitor1024`
   * The filtering fields are assumed to have an implicit AND.
   * </pre>
   *
   * <code>string filter = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for filter.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getFilterBytes() {
    java.lang.Object ref = filter_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      filter_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int FORCE_FIELD_NUMBER = 3;
  private boolean force_;
  /**
   * <pre>
   * Optional. The default value is false. Override this flag to true to
   * actually perform the purge. If the field is not set to true, a sampling of
   * events to be deleted will be returned.
   * </pre>
   *
   * <code>bool force = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The force.
   */
  @java.lang.Override
  public boolean getForce() {
    return force_;
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
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(parent_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, parent_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(filter_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, filter_);
    }
    if (force_ != false) {
      output.writeBool(3, force_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(parent_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, parent_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(filter_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, filter_);
    }
    if (force_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(3, force_);
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
    if (!(obj instanceof com.google.cloud.recommendationengine.v1beta1.PurgeUserEventsRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.recommendationengine.v1beta1.PurgeUserEventsRequest other = (com.google.cloud.recommendationengine.v1beta1.PurgeUserEventsRequest) obj;

    if (!getParent()
        .equals(other.getParent())) return false;
    if (!getFilter()
        .equals(other.getFilter())) return false;
    if (getForce()
        != other.getForce()) return false;
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
    hash = (37 * hash) + PARENT_FIELD_NUMBER;
    hash = (53 * hash) + getParent().hashCode();
    hash = (37 * hash) + FILTER_FIELD_NUMBER;
    hash = (53 * hash) + getFilter().hashCode();
    hash = (37 * hash) + FORCE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getForce());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.recommendationengine.v1beta1.PurgeUserEventsRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.recommendationengine.v1beta1.PurgeUserEventsRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.recommendationengine.v1beta1.PurgeUserEventsRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.recommendationengine.v1beta1.PurgeUserEventsRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.recommendationengine.v1beta1.PurgeUserEventsRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.recommendationengine.v1beta1.PurgeUserEventsRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.recommendationengine.v1beta1.PurgeUserEventsRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.recommendationengine.v1beta1.PurgeUserEventsRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.recommendationengine.v1beta1.PurgeUserEventsRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.recommendationengine.v1beta1.PurgeUserEventsRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.recommendationengine.v1beta1.PurgeUserEventsRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.recommendationengine.v1beta1.PurgeUserEventsRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.google.cloud.recommendationengine.v1beta1.PurgeUserEventsRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
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
   * Request message for PurgeUserEvents method.
   * </pre>
   *
   * Protobuf type {@code google.cloud.recommendationengine.v1beta1.PurgeUserEventsRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.recommendationengine.v1beta1.PurgeUserEventsRequest)
      com.google.cloud.recommendationengine.v1beta1.PurgeUserEventsRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.recommendationengine.v1beta1.UserEventServiceOuterClass.internal_static_google_cloud_recommendationengine_v1beta1_PurgeUserEventsRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.recommendationengine.v1beta1.UserEventServiceOuterClass.internal_static_google_cloud_recommendationengine_v1beta1_PurgeUserEventsRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.recommendationengine.v1beta1.PurgeUserEventsRequest.class, com.google.cloud.recommendationengine.v1beta1.PurgeUserEventsRequest.Builder.class);
    }

    // Construct using com.google.cloud.recommendationengine.v1beta1.PurgeUserEventsRequest.newBuilder()
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
    @java.lang.Override
    public Builder clear() {
      super.clear();
      parent_ = "";

      filter_ = "";

      force_ = false;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.recommendationengine.v1beta1.UserEventServiceOuterClass.internal_static_google_cloud_recommendationengine_v1beta1_PurgeUserEventsRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.recommendationengine.v1beta1.PurgeUserEventsRequest getDefaultInstanceForType() {
      return com.google.cloud.recommendationengine.v1beta1.PurgeUserEventsRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.recommendationengine.v1beta1.PurgeUserEventsRequest build() {
      com.google.cloud.recommendationengine.v1beta1.PurgeUserEventsRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.recommendationengine.v1beta1.PurgeUserEventsRequest buildPartial() {
      com.google.cloud.recommendationengine.v1beta1.PurgeUserEventsRequest result = new com.google.cloud.recommendationengine.v1beta1.PurgeUserEventsRequest(this);
      result.parent_ = parent_;
      result.filter_ = filter_;
      result.force_ = force_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.recommendationengine.v1beta1.PurgeUserEventsRequest) {
        return mergeFrom((com.google.cloud.recommendationengine.v1beta1.PurgeUserEventsRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.recommendationengine.v1beta1.PurgeUserEventsRequest other) {
      if (other == com.google.cloud.recommendationengine.v1beta1.PurgeUserEventsRequest.getDefaultInstance()) return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        onChanged();
      }
      if (!other.getFilter().isEmpty()) {
        filter_ = other.filter_;
        onChanged();
      }
      if (other.getForce() != false) {
        setForce(other.getForce());
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
      com.google.cloud.recommendationengine.v1beta1.PurgeUserEventsRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.recommendationengine.v1beta1.PurgeUserEventsRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object parent_ = "";
    /**
     * <pre>
     * Required. The resource name of the event_store under which the events are
     * created. The format is
     * `projects/${projectId}/locations/global/catalogs/${catalogId}/eventStores/${eventStoreId}`
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @return The parent.
     */
    public java.lang.String getParent() {
      java.lang.Object ref = parent_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        parent_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Required. The resource name of the event_store under which the events are
     * created. The format is
     * `projects/${projectId}/locations/global/catalogs/${catalogId}/eventStores/${eventStoreId}`
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @return The bytes for parent.
     */
    public com.google.protobuf.ByteString
        getParentBytes() {
      java.lang.Object ref = parent_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        parent_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Required. The resource name of the event_store under which the events are
     * created. The format is
     * `projects/${projectId}/locations/global/catalogs/${catalogId}/eventStores/${eventStoreId}`
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @param value The parent to set.
     * @return This builder for chaining.
     */
    public Builder setParent(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      parent_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The resource name of the event_store under which the events are
     * created. The format is
     * `projects/${projectId}/locations/global/catalogs/${catalogId}/eventStores/${eventStoreId}`
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearParent() {
      
      parent_ = getDefaultInstance().getParent();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The resource name of the event_store under which the events are
     * created. The format is
     * `projects/${projectId}/locations/global/catalogs/${catalogId}/eventStores/${eventStoreId}`
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @param value The bytes for parent to set.
     * @return This builder for chaining.
     */
    public Builder setParentBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      parent_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object filter_ = "";
    /**
     * <pre>
     * Required. The filter string to specify the events to be deleted. Empty
     * string filter is not allowed. This filter can also be used with
     * ListUserEvents API to list events that will be deleted. The eligible fields
     * for filtering are:
     * * eventType - UserEvent.eventType field of type string.
     * * eventTime - in ISO 8601 "zulu" format.
     * * visitorId - field of type string. Specifying this will delete all events
     * associated with a visitor.
     * * userId - field of type string. Specifying this will delete all events
     * associated with a user.
     * Example 1: Deleting all events in a time range.
     * `eventTime &gt; "2012-04-23T18:25:43.511Z" eventTime &lt;
     * "2012-04-23T18:30:43.511Z"`
     * Example 2: Deleting specific eventType in time range.
     * `eventTime &gt; "2012-04-23T18:25:43.511Z" eventType = "detail-page-view"`
     * Example 3: Deleting all events for a specific visitor
     * `visitorId = visitor1024`
     * The filtering fields are assumed to have an implicit AND.
     * </pre>
     *
     * <code>string filter = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The filter.
     */
    public java.lang.String getFilter() {
      java.lang.Object ref = filter_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        filter_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Required. The filter string to specify the events to be deleted. Empty
     * string filter is not allowed. This filter can also be used with
     * ListUserEvents API to list events that will be deleted. The eligible fields
     * for filtering are:
     * * eventType - UserEvent.eventType field of type string.
     * * eventTime - in ISO 8601 "zulu" format.
     * * visitorId - field of type string. Specifying this will delete all events
     * associated with a visitor.
     * * userId - field of type string. Specifying this will delete all events
     * associated with a user.
     * Example 1: Deleting all events in a time range.
     * `eventTime &gt; "2012-04-23T18:25:43.511Z" eventTime &lt;
     * "2012-04-23T18:30:43.511Z"`
     * Example 2: Deleting specific eventType in time range.
     * `eventTime &gt; "2012-04-23T18:25:43.511Z" eventType = "detail-page-view"`
     * Example 3: Deleting all events for a specific visitor
     * `visitorId = visitor1024`
     * The filtering fields are assumed to have an implicit AND.
     * </pre>
     *
     * <code>string filter = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The bytes for filter.
     */
    public com.google.protobuf.ByteString
        getFilterBytes() {
      java.lang.Object ref = filter_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        filter_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Required. The filter string to specify the events to be deleted. Empty
     * string filter is not allowed. This filter can also be used with
     * ListUserEvents API to list events that will be deleted. The eligible fields
     * for filtering are:
     * * eventType - UserEvent.eventType field of type string.
     * * eventTime - in ISO 8601 "zulu" format.
     * * visitorId - field of type string. Specifying this will delete all events
     * associated with a visitor.
     * * userId - field of type string. Specifying this will delete all events
     * associated with a user.
     * Example 1: Deleting all events in a time range.
     * `eventTime &gt; "2012-04-23T18:25:43.511Z" eventTime &lt;
     * "2012-04-23T18:30:43.511Z"`
     * Example 2: Deleting specific eventType in time range.
     * `eventTime &gt; "2012-04-23T18:25:43.511Z" eventType = "detail-page-view"`
     * Example 3: Deleting all events for a specific visitor
     * `visitorId = visitor1024`
     * The filtering fields are assumed to have an implicit AND.
     * </pre>
     *
     * <code>string filter = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The filter to set.
     * @return This builder for chaining.
     */
    public Builder setFilter(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      filter_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The filter string to specify the events to be deleted. Empty
     * string filter is not allowed. This filter can also be used with
     * ListUserEvents API to list events that will be deleted. The eligible fields
     * for filtering are:
     * * eventType - UserEvent.eventType field of type string.
     * * eventTime - in ISO 8601 "zulu" format.
     * * visitorId - field of type string. Specifying this will delete all events
     * associated with a visitor.
     * * userId - field of type string. Specifying this will delete all events
     * associated with a user.
     * Example 1: Deleting all events in a time range.
     * `eventTime &gt; "2012-04-23T18:25:43.511Z" eventTime &lt;
     * "2012-04-23T18:30:43.511Z"`
     * Example 2: Deleting specific eventType in time range.
     * `eventTime &gt; "2012-04-23T18:25:43.511Z" eventType = "detail-page-view"`
     * Example 3: Deleting all events for a specific visitor
     * `visitorId = visitor1024`
     * The filtering fields are assumed to have an implicit AND.
     * </pre>
     *
     * <code>string filter = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return This builder for chaining.
     */
    public Builder clearFilter() {
      
      filter_ = getDefaultInstance().getFilter();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The filter string to specify the events to be deleted. Empty
     * string filter is not allowed. This filter can also be used with
     * ListUserEvents API to list events that will be deleted. The eligible fields
     * for filtering are:
     * * eventType - UserEvent.eventType field of type string.
     * * eventTime - in ISO 8601 "zulu" format.
     * * visitorId - field of type string. Specifying this will delete all events
     * associated with a visitor.
     * * userId - field of type string. Specifying this will delete all events
     * associated with a user.
     * Example 1: Deleting all events in a time range.
     * `eventTime &gt; "2012-04-23T18:25:43.511Z" eventTime &lt;
     * "2012-04-23T18:30:43.511Z"`
     * Example 2: Deleting specific eventType in time range.
     * `eventTime &gt; "2012-04-23T18:25:43.511Z" eventType = "detail-page-view"`
     * Example 3: Deleting all events for a specific visitor
     * `visitorId = visitor1024`
     * The filtering fields are assumed to have an implicit AND.
     * </pre>
     *
     * <code>string filter = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The bytes for filter to set.
     * @return This builder for chaining.
     */
    public Builder setFilterBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      filter_ = value;
      onChanged();
      return this;
    }

    private boolean force_ ;
    /**
     * <pre>
     * Optional. The default value is false. Override this flag to true to
     * actually perform the purge. If the field is not set to true, a sampling of
     * events to be deleted will be returned.
     * </pre>
     *
     * <code>bool force = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @return The force.
     */
    @java.lang.Override
    public boolean getForce() {
      return force_;
    }
    /**
     * <pre>
     * Optional. The default value is false. Override this flag to true to
     * actually perform the purge. If the field is not set to true, a sampling of
     * events to be deleted will be returned.
     * </pre>
     *
     * <code>bool force = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @param value The force to set.
     * @return This builder for chaining.
     */
    public Builder setForce(boolean value) {
      
      force_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Optional. The default value is false. Override this flag to true to
     * actually perform the purge. If the field is not set to true, a sampling of
     * events to be deleted will be returned.
     * </pre>
     *
     * <code>bool force = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @return This builder for chaining.
     */
    public Builder clearForce() {
      
      force_ = false;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:google.cloud.recommendationengine.v1beta1.PurgeUserEventsRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.recommendationengine.v1beta1.PurgeUserEventsRequest)
  private static final com.google.cloud.recommendationengine.v1beta1.PurgeUserEventsRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.recommendationengine.v1beta1.PurgeUserEventsRequest();
  }

  public static com.google.cloud.recommendationengine.v1beta1.PurgeUserEventsRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PurgeUserEventsRequest>
      PARSER = new com.google.protobuf.AbstractParser<PurgeUserEventsRequest>() {
    @java.lang.Override
    public PurgeUserEventsRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new PurgeUserEventsRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<PurgeUserEventsRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PurgeUserEventsRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.recommendationengine.v1beta1.PurgeUserEventsRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

