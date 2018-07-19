// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dialogflow/v2beta1/webhook.proto

package com.google.cloud.dialogflow.v2beta1;

/**
 * <pre>
 * Represents the contents of the original request that was passed to
 * the `[Streaming]DetectIntent` call.
 * </pre>
 *
 * Protobuf type {@code google.cloud.dialogflow.v2beta1.OriginalDetectIntentRequest}
 */
public  final class OriginalDetectIntentRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.dialogflow.v2beta1.OriginalDetectIntentRequest)
    OriginalDetectIntentRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use OriginalDetectIntentRequest.newBuilder() to construct.
  private OriginalDetectIntentRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private OriginalDetectIntentRequest() {
    source_ = "";
    version_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private OriginalDetectIntentRequest(
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

            source_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            version_ = s;
            break;
          }
          case 26: {
            com.google.protobuf.Struct.Builder subBuilder = null;
            if (payload_ != null) {
              subBuilder = payload_.toBuilder();
            }
            payload_ = input.readMessage(com.google.protobuf.Struct.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(payload_);
              payload_ = subBuilder.buildPartial();
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
    return com.google.cloud.dialogflow.v2beta1.WebhookProto.internal_static_google_cloud_dialogflow_v2beta1_OriginalDetectIntentRequest_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.dialogflow.v2beta1.WebhookProto.internal_static_google_cloud_dialogflow_v2beta1_OriginalDetectIntentRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.dialogflow.v2beta1.OriginalDetectIntentRequest.class, com.google.cloud.dialogflow.v2beta1.OriginalDetectIntentRequest.Builder.class);
  }

  public static final int SOURCE_FIELD_NUMBER = 1;
  private volatile java.lang.Object source_;
  /**
   * <pre>
   * The source of this request, e.g., `google`, `facebook`, `slack`. It is set
   * by Dialogflow-owned servers.
   * </pre>
   *
   * <code>string source = 1;</code>
   */
  public java.lang.String getSource() {
    java.lang.Object ref = source_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      source_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The source of this request, e.g., `google`, `facebook`, `slack`. It is set
   * by Dialogflow-owned servers.
   * </pre>
   *
   * <code>string source = 1;</code>
   */
  public com.google.protobuf.ByteString
      getSourceBytes() {
    java.lang.Object ref = source_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      source_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int VERSION_FIELD_NUMBER = 2;
  private volatile java.lang.Object version_;
  /**
   * <pre>
   * Optional. The version of the protocol used for this request.
   * This field is AoG-specific.
   * </pre>
   *
   * <code>string version = 2;</code>
   */
  public java.lang.String getVersion() {
    java.lang.Object ref = version_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      version_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Optional. The version of the protocol used for this request.
   * This field is AoG-specific.
   * </pre>
   *
   * <code>string version = 2;</code>
   */
  public com.google.protobuf.ByteString
      getVersionBytes() {
    java.lang.Object ref = version_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      version_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PAYLOAD_FIELD_NUMBER = 3;
  private com.google.protobuf.Struct payload_;
  /**
   * <pre>
   * Optional. This field is set to the value of `QueryParameters.payload` field
   * passed in the request.
   * This field is used for the telephony gateway. It should have a
   * structure similar to this JSON message:
   * &lt;pre&gt;{
   *  "telephony": {
   *    "caller_id": "+18558363987"
   *  }
   * }&lt;/pre&gt;
   * Note: The caller ID field (`caller_id`) will be in
   * [E.164 format](https://en.wikipedia.org/wiki/E.164) and is only supported
   * for Enterprise Edition and not for Standard Edition agents. When the
   * telephony gateway is used with a standard tier agent the `caller_id` field
   * above will have a value of `REDACTED_IN_STANDARD_TIER_AGENT`.
   * </pre>
   *
   * <code>.google.protobuf.Struct payload = 3;</code>
   */
  public boolean hasPayload() {
    return payload_ != null;
  }
  /**
   * <pre>
   * Optional. This field is set to the value of `QueryParameters.payload` field
   * passed in the request.
   * This field is used for the telephony gateway. It should have a
   * structure similar to this JSON message:
   * &lt;pre&gt;{
   *  "telephony": {
   *    "caller_id": "+18558363987"
   *  }
   * }&lt;/pre&gt;
   * Note: The caller ID field (`caller_id`) will be in
   * [E.164 format](https://en.wikipedia.org/wiki/E.164) and is only supported
   * for Enterprise Edition and not for Standard Edition agents. When the
   * telephony gateway is used with a standard tier agent the `caller_id` field
   * above will have a value of `REDACTED_IN_STANDARD_TIER_AGENT`.
   * </pre>
   *
   * <code>.google.protobuf.Struct payload = 3;</code>
   */
  public com.google.protobuf.Struct getPayload() {
    return payload_ == null ? com.google.protobuf.Struct.getDefaultInstance() : payload_;
  }
  /**
   * <pre>
   * Optional. This field is set to the value of `QueryParameters.payload` field
   * passed in the request.
   * This field is used for the telephony gateway. It should have a
   * structure similar to this JSON message:
   * &lt;pre&gt;{
   *  "telephony": {
   *    "caller_id": "+18558363987"
   *  }
   * }&lt;/pre&gt;
   * Note: The caller ID field (`caller_id`) will be in
   * [E.164 format](https://en.wikipedia.org/wiki/E.164) and is only supported
   * for Enterprise Edition and not for Standard Edition agents. When the
   * telephony gateway is used with a standard tier agent the `caller_id` field
   * above will have a value of `REDACTED_IN_STANDARD_TIER_AGENT`.
   * </pre>
   *
   * <code>.google.protobuf.Struct payload = 3;</code>
   */
  public com.google.protobuf.StructOrBuilder getPayloadOrBuilder() {
    return getPayload();
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
    if (!getSourceBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, source_);
    }
    if (!getVersionBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, version_);
    }
    if (payload_ != null) {
      output.writeMessage(3, getPayload());
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getSourceBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, source_);
    }
    if (!getVersionBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, version_);
    }
    if (payload_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getPayload());
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
    if (!(obj instanceof com.google.cloud.dialogflow.v2beta1.OriginalDetectIntentRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.dialogflow.v2beta1.OriginalDetectIntentRequest other = (com.google.cloud.dialogflow.v2beta1.OriginalDetectIntentRequest) obj;

    boolean result = true;
    result = result && getSource()
        .equals(other.getSource());
    result = result && getVersion()
        .equals(other.getVersion());
    result = result && (hasPayload() == other.hasPayload());
    if (hasPayload()) {
      result = result && getPayload()
          .equals(other.getPayload());
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
    hash = (37 * hash) + SOURCE_FIELD_NUMBER;
    hash = (53 * hash) + getSource().hashCode();
    hash = (37 * hash) + VERSION_FIELD_NUMBER;
    hash = (53 * hash) + getVersion().hashCode();
    if (hasPayload()) {
      hash = (37 * hash) + PAYLOAD_FIELD_NUMBER;
      hash = (53 * hash) + getPayload().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.dialogflow.v2beta1.OriginalDetectIntentRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.dialogflow.v2beta1.OriginalDetectIntentRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.dialogflow.v2beta1.OriginalDetectIntentRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.dialogflow.v2beta1.OriginalDetectIntentRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.dialogflow.v2beta1.OriginalDetectIntentRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.dialogflow.v2beta1.OriginalDetectIntentRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.dialogflow.v2beta1.OriginalDetectIntentRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.dialogflow.v2beta1.OriginalDetectIntentRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.dialogflow.v2beta1.OriginalDetectIntentRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.dialogflow.v2beta1.OriginalDetectIntentRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.dialogflow.v2beta1.OriginalDetectIntentRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.dialogflow.v2beta1.OriginalDetectIntentRequest parseFrom(
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
  public static Builder newBuilder(com.google.cloud.dialogflow.v2beta1.OriginalDetectIntentRequest prototype) {
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
   * Represents the contents of the original request that was passed to
   * the `[Streaming]DetectIntent` call.
   * </pre>
   *
   * Protobuf type {@code google.cloud.dialogflow.v2beta1.OriginalDetectIntentRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.dialogflow.v2beta1.OriginalDetectIntentRequest)
      com.google.cloud.dialogflow.v2beta1.OriginalDetectIntentRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.dialogflow.v2beta1.WebhookProto.internal_static_google_cloud_dialogflow_v2beta1_OriginalDetectIntentRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.dialogflow.v2beta1.WebhookProto.internal_static_google_cloud_dialogflow_v2beta1_OriginalDetectIntentRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.dialogflow.v2beta1.OriginalDetectIntentRequest.class, com.google.cloud.dialogflow.v2beta1.OriginalDetectIntentRequest.Builder.class);
    }

    // Construct using com.google.cloud.dialogflow.v2beta1.OriginalDetectIntentRequest.newBuilder()
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
      source_ = "";

      version_ = "";

      if (payloadBuilder_ == null) {
        payload_ = null;
      } else {
        payload_ = null;
        payloadBuilder_ = null;
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.dialogflow.v2beta1.WebhookProto.internal_static_google_cloud_dialogflow_v2beta1_OriginalDetectIntentRequest_descriptor;
    }

    public com.google.cloud.dialogflow.v2beta1.OriginalDetectIntentRequest getDefaultInstanceForType() {
      return com.google.cloud.dialogflow.v2beta1.OriginalDetectIntentRequest.getDefaultInstance();
    }

    public com.google.cloud.dialogflow.v2beta1.OriginalDetectIntentRequest build() {
      com.google.cloud.dialogflow.v2beta1.OriginalDetectIntentRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.google.cloud.dialogflow.v2beta1.OriginalDetectIntentRequest buildPartial() {
      com.google.cloud.dialogflow.v2beta1.OriginalDetectIntentRequest result = new com.google.cloud.dialogflow.v2beta1.OriginalDetectIntentRequest(this);
      result.source_ = source_;
      result.version_ = version_;
      if (payloadBuilder_ == null) {
        result.payload_ = payload_;
      } else {
        result.payload_ = payloadBuilder_.build();
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
      if (other instanceof com.google.cloud.dialogflow.v2beta1.OriginalDetectIntentRequest) {
        return mergeFrom((com.google.cloud.dialogflow.v2beta1.OriginalDetectIntentRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.dialogflow.v2beta1.OriginalDetectIntentRequest other) {
      if (other == com.google.cloud.dialogflow.v2beta1.OriginalDetectIntentRequest.getDefaultInstance()) return this;
      if (!other.getSource().isEmpty()) {
        source_ = other.source_;
        onChanged();
      }
      if (!other.getVersion().isEmpty()) {
        version_ = other.version_;
        onChanged();
      }
      if (other.hasPayload()) {
        mergePayload(other.getPayload());
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
      com.google.cloud.dialogflow.v2beta1.OriginalDetectIntentRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.dialogflow.v2beta1.OriginalDetectIntentRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object source_ = "";
    /**
     * <pre>
     * The source of this request, e.g., `google`, `facebook`, `slack`. It is set
     * by Dialogflow-owned servers.
     * </pre>
     *
     * <code>string source = 1;</code>
     */
    public java.lang.String getSource() {
      java.lang.Object ref = source_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        source_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The source of this request, e.g., `google`, `facebook`, `slack`. It is set
     * by Dialogflow-owned servers.
     * </pre>
     *
     * <code>string source = 1;</code>
     */
    public com.google.protobuf.ByteString
        getSourceBytes() {
      java.lang.Object ref = source_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        source_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The source of this request, e.g., `google`, `facebook`, `slack`. It is set
     * by Dialogflow-owned servers.
     * </pre>
     *
     * <code>string source = 1;</code>
     */
    public Builder setSource(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      source_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The source of this request, e.g., `google`, `facebook`, `slack`. It is set
     * by Dialogflow-owned servers.
     * </pre>
     *
     * <code>string source = 1;</code>
     */
    public Builder clearSource() {
      
      source_ = getDefaultInstance().getSource();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The source of this request, e.g., `google`, `facebook`, `slack`. It is set
     * by Dialogflow-owned servers.
     * </pre>
     *
     * <code>string source = 1;</code>
     */
    public Builder setSourceBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      source_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object version_ = "";
    /**
     * <pre>
     * Optional. The version of the protocol used for this request.
     * This field is AoG-specific.
     * </pre>
     *
     * <code>string version = 2;</code>
     */
    public java.lang.String getVersion() {
      java.lang.Object ref = version_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        version_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Optional. The version of the protocol used for this request.
     * This field is AoG-specific.
     * </pre>
     *
     * <code>string version = 2;</code>
     */
    public com.google.protobuf.ByteString
        getVersionBytes() {
      java.lang.Object ref = version_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        version_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Optional. The version of the protocol used for this request.
     * This field is AoG-specific.
     * </pre>
     *
     * <code>string version = 2;</code>
     */
    public Builder setVersion(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      version_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Optional. The version of the protocol used for this request.
     * This field is AoG-specific.
     * </pre>
     *
     * <code>string version = 2;</code>
     */
    public Builder clearVersion() {
      
      version_ = getDefaultInstance().getVersion();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Optional. The version of the protocol used for this request.
     * This field is AoG-specific.
     * </pre>
     *
     * <code>string version = 2;</code>
     */
    public Builder setVersionBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      version_ = value;
      onChanged();
      return this;
    }

    private com.google.protobuf.Struct payload_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Struct, com.google.protobuf.Struct.Builder, com.google.protobuf.StructOrBuilder> payloadBuilder_;
    /**
     * <pre>
     * Optional. This field is set to the value of `QueryParameters.payload` field
     * passed in the request.
     * This field is used for the telephony gateway. It should have a
     * structure similar to this JSON message:
     * &lt;pre&gt;{
     *  "telephony": {
     *    "caller_id": "+18558363987"
     *  }
     * }&lt;/pre&gt;
     * Note: The caller ID field (`caller_id`) will be in
     * [E.164 format](https://en.wikipedia.org/wiki/E.164) and is only supported
     * for Enterprise Edition and not for Standard Edition agents. When the
     * telephony gateway is used with a standard tier agent the `caller_id` field
     * above will have a value of `REDACTED_IN_STANDARD_TIER_AGENT`.
     * </pre>
     *
     * <code>.google.protobuf.Struct payload = 3;</code>
     */
    public boolean hasPayload() {
      return payloadBuilder_ != null || payload_ != null;
    }
    /**
     * <pre>
     * Optional. This field is set to the value of `QueryParameters.payload` field
     * passed in the request.
     * This field is used for the telephony gateway. It should have a
     * structure similar to this JSON message:
     * &lt;pre&gt;{
     *  "telephony": {
     *    "caller_id": "+18558363987"
     *  }
     * }&lt;/pre&gt;
     * Note: The caller ID field (`caller_id`) will be in
     * [E.164 format](https://en.wikipedia.org/wiki/E.164) and is only supported
     * for Enterprise Edition and not for Standard Edition agents. When the
     * telephony gateway is used with a standard tier agent the `caller_id` field
     * above will have a value of `REDACTED_IN_STANDARD_TIER_AGENT`.
     * </pre>
     *
     * <code>.google.protobuf.Struct payload = 3;</code>
     */
    public com.google.protobuf.Struct getPayload() {
      if (payloadBuilder_ == null) {
        return payload_ == null ? com.google.protobuf.Struct.getDefaultInstance() : payload_;
      } else {
        return payloadBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Optional. This field is set to the value of `QueryParameters.payload` field
     * passed in the request.
     * This field is used for the telephony gateway. It should have a
     * structure similar to this JSON message:
     * &lt;pre&gt;{
     *  "telephony": {
     *    "caller_id": "+18558363987"
     *  }
     * }&lt;/pre&gt;
     * Note: The caller ID field (`caller_id`) will be in
     * [E.164 format](https://en.wikipedia.org/wiki/E.164) and is only supported
     * for Enterprise Edition and not for Standard Edition agents. When the
     * telephony gateway is used with a standard tier agent the `caller_id` field
     * above will have a value of `REDACTED_IN_STANDARD_TIER_AGENT`.
     * </pre>
     *
     * <code>.google.protobuf.Struct payload = 3;</code>
     */
    public Builder setPayload(com.google.protobuf.Struct value) {
      if (payloadBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        payload_ = value;
        onChanged();
      } else {
        payloadBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Optional. This field is set to the value of `QueryParameters.payload` field
     * passed in the request.
     * This field is used for the telephony gateway. It should have a
     * structure similar to this JSON message:
     * &lt;pre&gt;{
     *  "telephony": {
     *    "caller_id": "+18558363987"
     *  }
     * }&lt;/pre&gt;
     * Note: The caller ID field (`caller_id`) will be in
     * [E.164 format](https://en.wikipedia.org/wiki/E.164) and is only supported
     * for Enterprise Edition and not for Standard Edition agents. When the
     * telephony gateway is used with a standard tier agent the `caller_id` field
     * above will have a value of `REDACTED_IN_STANDARD_TIER_AGENT`.
     * </pre>
     *
     * <code>.google.protobuf.Struct payload = 3;</code>
     */
    public Builder setPayload(
        com.google.protobuf.Struct.Builder builderForValue) {
      if (payloadBuilder_ == null) {
        payload_ = builderForValue.build();
        onChanged();
      } else {
        payloadBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Optional. This field is set to the value of `QueryParameters.payload` field
     * passed in the request.
     * This field is used for the telephony gateway. It should have a
     * structure similar to this JSON message:
     * &lt;pre&gt;{
     *  "telephony": {
     *    "caller_id": "+18558363987"
     *  }
     * }&lt;/pre&gt;
     * Note: The caller ID field (`caller_id`) will be in
     * [E.164 format](https://en.wikipedia.org/wiki/E.164) and is only supported
     * for Enterprise Edition and not for Standard Edition agents. When the
     * telephony gateway is used with a standard tier agent the `caller_id` field
     * above will have a value of `REDACTED_IN_STANDARD_TIER_AGENT`.
     * </pre>
     *
     * <code>.google.protobuf.Struct payload = 3;</code>
     */
    public Builder mergePayload(com.google.protobuf.Struct value) {
      if (payloadBuilder_ == null) {
        if (payload_ != null) {
          payload_ =
            com.google.protobuf.Struct.newBuilder(payload_).mergeFrom(value).buildPartial();
        } else {
          payload_ = value;
        }
        onChanged();
      } else {
        payloadBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Optional. This field is set to the value of `QueryParameters.payload` field
     * passed in the request.
     * This field is used for the telephony gateway. It should have a
     * structure similar to this JSON message:
     * &lt;pre&gt;{
     *  "telephony": {
     *    "caller_id": "+18558363987"
     *  }
     * }&lt;/pre&gt;
     * Note: The caller ID field (`caller_id`) will be in
     * [E.164 format](https://en.wikipedia.org/wiki/E.164) and is only supported
     * for Enterprise Edition and not for Standard Edition agents. When the
     * telephony gateway is used with a standard tier agent the `caller_id` field
     * above will have a value of `REDACTED_IN_STANDARD_TIER_AGENT`.
     * </pre>
     *
     * <code>.google.protobuf.Struct payload = 3;</code>
     */
    public Builder clearPayload() {
      if (payloadBuilder_ == null) {
        payload_ = null;
        onChanged();
      } else {
        payload_ = null;
        payloadBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Optional. This field is set to the value of `QueryParameters.payload` field
     * passed in the request.
     * This field is used for the telephony gateway. It should have a
     * structure similar to this JSON message:
     * &lt;pre&gt;{
     *  "telephony": {
     *    "caller_id": "+18558363987"
     *  }
     * }&lt;/pre&gt;
     * Note: The caller ID field (`caller_id`) will be in
     * [E.164 format](https://en.wikipedia.org/wiki/E.164) and is only supported
     * for Enterprise Edition and not for Standard Edition agents. When the
     * telephony gateway is used with a standard tier agent the `caller_id` field
     * above will have a value of `REDACTED_IN_STANDARD_TIER_AGENT`.
     * </pre>
     *
     * <code>.google.protobuf.Struct payload = 3;</code>
     */
    public com.google.protobuf.Struct.Builder getPayloadBuilder() {
      
      onChanged();
      return getPayloadFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Optional. This field is set to the value of `QueryParameters.payload` field
     * passed in the request.
     * This field is used for the telephony gateway. It should have a
     * structure similar to this JSON message:
     * &lt;pre&gt;{
     *  "telephony": {
     *    "caller_id": "+18558363987"
     *  }
     * }&lt;/pre&gt;
     * Note: The caller ID field (`caller_id`) will be in
     * [E.164 format](https://en.wikipedia.org/wiki/E.164) and is only supported
     * for Enterprise Edition and not for Standard Edition agents. When the
     * telephony gateway is used with a standard tier agent the `caller_id` field
     * above will have a value of `REDACTED_IN_STANDARD_TIER_AGENT`.
     * </pre>
     *
     * <code>.google.protobuf.Struct payload = 3;</code>
     */
    public com.google.protobuf.StructOrBuilder getPayloadOrBuilder() {
      if (payloadBuilder_ != null) {
        return payloadBuilder_.getMessageOrBuilder();
      } else {
        return payload_ == null ?
            com.google.protobuf.Struct.getDefaultInstance() : payload_;
      }
    }
    /**
     * <pre>
     * Optional. This field is set to the value of `QueryParameters.payload` field
     * passed in the request.
     * This field is used for the telephony gateway. It should have a
     * structure similar to this JSON message:
     * &lt;pre&gt;{
     *  "telephony": {
     *    "caller_id": "+18558363987"
     *  }
     * }&lt;/pre&gt;
     * Note: The caller ID field (`caller_id`) will be in
     * [E.164 format](https://en.wikipedia.org/wiki/E.164) and is only supported
     * for Enterprise Edition and not for Standard Edition agents. When the
     * telephony gateway is used with a standard tier agent the `caller_id` field
     * above will have a value of `REDACTED_IN_STANDARD_TIER_AGENT`.
     * </pre>
     *
     * <code>.google.protobuf.Struct payload = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Struct, com.google.protobuf.Struct.Builder, com.google.protobuf.StructOrBuilder> 
        getPayloadFieldBuilder() {
      if (payloadBuilder_ == null) {
        payloadBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Struct, com.google.protobuf.Struct.Builder, com.google.protobuf.StructOrBuilder>(
                getPayload(),
                getParentForChildren(),
                isClean());
        payload_ = null;
      }
      return payloadBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:google.cloud.dialogflow.v2beta1.OriginalDetectIntentRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.dialogflow.v2beta1.OriginalDetectIntentRequest)
  private static final com.google.cloud.dialogflow.v2beta1.OriginalDetectIntentRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.dialogflow.v2beta1.OriginalDetectIntentRequest();
  }

  public static com.google.cloud.dialogflow.v2beta1.OriginalDetectIntentRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<OriginalDetectIntentRequest>
      PARSER = new com.google.protobuf.AbstractParser<OriginalDetectIntentRequest>() {
    public OriginalDetectIntentRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new OriginalDetectIntentRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<OriginalDetectIntentRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<OriginalDetectIntentRequest> getParserForType() {
    return PARSER;
  }

  public com.google.cloud.dialogflow.v2beta1.OriginalDetectIntentRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

