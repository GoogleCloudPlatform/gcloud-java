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
// source: google/cloud/aiplatform/v1beta1/persistent_resource.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.aiplatform.v1beta1;

/**
 *
 *
 * <pre>
 * Persistent Cluster runtime information as output
 * </pre>
 *
 * Protobuf type {@code google.cloud.aiplatform.v1beta1.ResourceRuntime}
 */
public final class ResourceRuntime extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.aiplatform.v1beta1.ResourceRuntime)
    ResourceRuntimeOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ResourceRuntime.newBuilder() to construct.
  private ResourceRuntime(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ResourceRuntime() {
    notebookRuntimeTemplate_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ResourceRuntime();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.aiplatform.v1beta1.PersistentResourceProto
        .internal_static_google_cloud_aiplatform_v1beta1_ResourceRuntime_descriptor;
  }

  @SuppressWarnings({"rawtypes"})
  @java.lang.Override
  protected com.google.protobuf.MapFieldReflectionAccessor internalGetMapFieldReflection(
      int number) {
    switch (number) {
      case 1:
        return internalGetAccessUris();
      default:
        throw new RuntimeException("Invalid map field number: " + number);
    }
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.aiplatform.v1beta1.PersistentResourceProto
        .internal_static_google_cloud_aiplatform_v1beta1_ResourceRuntime_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.aiplatform.v1beta1.ResourceRuntime.class,
            com.google.cloud.aiplatform.v1beta1.ResourceRuntime.Builder.class);
  }

  public static final int ACCESS_URIS_FIELD_NUMBER = 1;

  private static final class AccessUrisDefaultEntryHolder {
    static final com.google.protobuf.MapEntry<java.lang.String, java.lang.String> defaultEntry =
        com.google.protobuf.MapEntry.<java.lang.String, java.lang.String>newDefaultInstance(
            com.google.cloud.aiplatform.v1beta1.PersistentResourceProto
                .internal_static_google_cloud_aiplatform_v1beta1_ResourceRuntime_AccessUrisEntry_descriptor,
            com.google.protobuf.WireFormat.FieldType.STRING,
            "",
            com.google.protobuf.WireFormat.FieldType.STRING,
            "");
  }

  @SuppressWarnings("serial")
  private com.google.protobuf.MapField<java.lang.String, java.lang.String> accessUris_;

  private com.google.protobuf.MapField<java.lang.String, java.lang.String> internalGetAccessUris() {
    if (accessUris_ == null) {
      return com.google.protobuf.MapField.emptyMapField(AccessUrisDefaultEntryHolder.defaultEntry);
    }
    return accessUris_;
  }

  public int getAccessUrisCount() {
    return internalGetAccessUris().getMap().size();
  }
  /**
   *
   *
   * <pre>
   * Output only. URIs for user to connect to the Cluster.
   * Example:
   * {
   *   "RAY_HEAD_NODE_INTERNAL_IP": "head-node-IP:10001"
   *   "RAY_DASHBOARD_URI": "ray-dashboard-address:8888"
   * }
   * </pre>
   *
   * <code>map&lt;string, string&gt; access_uris = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  @java.lang.Override
  public boolean containsAccessUris(java.lang.String key) {
    if (key == null) {
      throw new NullPointerException("map key");
    }
    return internalGetAccessUris().getMap().containsKey(key);
  }
  /** Use {@link #getAccessUrisMap()} instead. */
  @java.lang.Override
  @java.lang.Deprecated
  public java.util.Map<java.lang.String, java.lang.String> getAccessUris() {
    return getAccessUrisMap();
  }
  /**
   *
   *
   * <pre>
   * Output only. URIs for user to connect to the Cluster.
   * Example:
   * {
   *   "RAY_HEAD_NODE_INTERNAL_IP": "head-node-IP:10001"
   *   "RAY_DASHBOARD_URI": "ray-dashboard-address:8888"
   * }
   * </pre>
   *
   * <code>map&lt;string, string&gt; access_uris = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  @java.lang.Override
  public java.util.Map<java.lang.String, java.lang.String> getAccessUrisMap() {
    return internalGetAccessUris().getMap();
  }
  /**
   *
   *
   * <pre>
   * Output only. URIs for user to connect to the Cluster.
   * Example:
   * {
   *   "RAY_HEAD_NODE_INTERNAL_IP": "head-node-IP:10001"
   *   "RAY_DASHBOARD_URI": "ray-dashboard-address:8888"
   * }
   * </pre>
   *
   * <code>map&lt;string, string&gt; access_uris = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  @java.lang.Override
  public /* nullable */ java.lang.String getAccessUrisOrDefault(
      java.lang.String key,
      /* nullable */
      java.lang.String defaultValue) {
    if (key == null) {
      throw new NullPointerException("map key");
    }
    java.util.Map<java.lang.String, java.lang.String> map = internalGetAccessUris().getMap();
    return map.containsKey(key) ? map.get(key) : defaultValue;
  }
  /**
   *
   *
   * <pre>
   * Output only. URIs for user to connect to the Cluster.
   * Example:
   * {
   *   "RAY_HEAD_NODE_INTERNAL_IP": "head-node-IP:10001"
   *   "RAY_DASHBOARD_URI": "ray-dashboard-address:8888"
   * }
   * </pre>
   *
   * <code>map&lt;string, string&gt; access_uris = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  @java.lang.Override
  public java.lang.String getAccessUrisOrThrow(java.lang.String key) {
    if (key == null) {
      throw new NullPointerException("map key");
    }
    java.util.Map<java.lang.String, java.lang.String> map = internalGetAccessUris().getMap();
    if (!map.containsKey(key)) {
      throw new java.lang.IllegalArgumentException();
    }
    return map.get(key);
  }

  public static final int NOTEBOOK_RUNTIME_TEMPLATE_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object notebookRuntimeTemplate_ = "";
  /**
   *
   *
   * <pre>
   * Output only. The resource name of NotebookRuntimeTemplate for the RoV
   * Persistent Cluster The NotebokRuntimeTemplate is created in the same VPC
   * (if set), and with the same Ray and Python version as the Persistent
   * Cluster. Example:
   *   "projects/1000/locations/us-central1/notebookRuntimeTemplates/abc123"
   * </pre>
   *
   * <code>
   * string notebook_runtime_template = 2 [deprecated = true, (.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @deprecated google.cloud.aiplatform.v1beta1.ResourceRuntime.notebook_runtime_template is
   *     deprecated. See google/cloud/aiplatform/v1beta1/persistent_resource.proto;l=290
   * @return The notebookRuntimeTemplate.
   */
  @java.lang.Override
  @java.lang.Deprecated
  public java.lang.String getNotebookRuntimeTemplate() {
    java.lang.Object ref = notebookRuntimeTemplate_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      notebookRuntimeTemplate_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Output only. The resource name of NotebookRuntimeTemplate for the RoV
   * Persistent Cluster The NotebokRuntimeTemplate is created in the same VPC
   * (if set), and with the same Ray and Python version as the Persistent
   * Cluster. Example:
   *   "projects/1000/locations/us-central1/notebookRuntimeTemplates/abc123"
   * </pre>
   *
   * <code>
   * string notebook_runtime_template = 2 [deprecated = true, (.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @deprecated google.cloud.aiplatform.v1beta1.ResourceRuntime.notebook_runtime_template is
   *     deprecated. See google/cloud/aiplatform/v1beta1/persistent_resource.proto;l=290
   * @return The bytes for notebookRuntimeTemplate.
   */
  @java.lang.Override
  @java.lang.Deprecated
  public com.google.protobuf.ByteString getNotebookRuntimeTemplateBytes() {
    java.lang.Object ref = notebookRuntimeTemplate_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      notebookRuntimeTemplate_ = b;
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
    com.google.protobuf.GeneratedMessageV3.serializeStringMapTo(
        output, internalGetAccessUris(), AccessUrisDefaultEntryHolder.defaultEntry, 1);
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(notebookRuntimeTemplate_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, notebookRuntimeTemplate_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (java.util.Map.Entry<java.lang.String, java.lang.String> entry :
        internalGetAccessUris().getMap().entrySet()) {
      com.google.protobuf.MapEntry<java.lang.String, java.lang.String> accessUris__ =
          AccessUrisDefaultEntryHolder.defaultEntry
              .newBuilderForType()
              .setKey(entry.getKey())
              .setValue(entry.getValue())
              .build();
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, accessUris__);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(notebookRuntimeTemplate_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, notebookRuntimeTemplate_);
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
    if (!(obj instanceof com.google.cloud.aiplatform.v1beta1.ResourceRuntime)) {
      return super.equals(obj);
    }
    com.google.cloud.aiplatform.v1beta1.ResourceRuntime other =
        (com.google.cloud.aiplatform.v1beta1.ResourceRuntime) obj;

    if (!internalGetAccessUris().equals(other.internalGetAccessUris())) return false;
    if (!getNotebookRuntimeTemplate().equals(other.getNotebookRuntimeTemplate())) return false;
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
    if (!internalGetAccessUris().getMap().isEmpty()) {
      hash = (37 * hash) + ACCESS_URIS_FIELD_NUMBER;
      hash = (53 * hash) + internalGetAccessUris().hashCode();
    }
    hash = (37 * hash) + NOTEBOOK_RUNTIME_TEMPLATE_FIELD_NUMBER;
    hash = (53 * hash) + getNotebookRuntimeTemplate().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.aiplatform.v1beta1.ResourceRuntime parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1beta1.ResourceRuntime parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.ResourceRuntime parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1beta1.ResourceRuntime parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.ResourceRuntime parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1beta1.ResourceRuntime parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.ResourceRuntime parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1beta1.ResourceRuntime parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.ResourceRuntime parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1beta1.ResourceRuntime parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.ResourceRuntime parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1beta1.ResourceRuntime parseFrom(
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

  public static Builder newBuilder(com.google.cloud.aiplatform.v1beta1.ResourceRuntime prototype) {
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
   * Persistent Cluster runtime information as output
   * </pre>
   *
   * Protobuf type {@code google.cloud.aiplatform.v1beta1.ResourceRuntime}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.aiplatform.v1beta1.ResourceRuntime)
      com.google.cloud.aiplatform.v1beta1.ResourceRuntimeOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.aiplatform.v1beta1.PersistentResourceProto
          .internal_static_google_cloud_aiplatform_v1beta1_ResourceRuntime_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapFieldReflectionAccessor internalGetMapFieldReflection(
        int number) {
      switch (number) {
        case 1:
          return internalGetAccessUris();
        default:
          throw new RuntimeException("Invalid map field number: " + number);
      }
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapFieldReflectionAccessor internalGetMutableMapFieldReflection(
        int number) {
      switch (number) {
        case 1:
          return internalGetMutableAccessUris();
        default:
          throw new RuntimeException("Invalid map field number: " + number);
      }
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.aiplatform.v1beta1.PersistentResourceProto
          .internal_static_google_cloud_aiplatform_v1beta1_ResourceRuntime_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.aiplatform.v1beta1.ResourceRuntime.class,
              com.google.cloud.aiplatform.v1beta1.ResourceRuntime.Builder.class);
    }

    // Construct using com.google.cloud.aiplatform.v1beta1.ResourceRuntime.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      internalGetMutableAccessUris().clear();
      notebookRuntimeTemplate_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.aiplatform.v1beta1.PersistentResourceProto
          .internal_static_google_cloud_aiplatform_v1beta1_ResourceRuntime_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.ResourceRuntime getDefaultInstanceForType() {
      return com.google.cloud.aiplatform.v1beta1.ResourceRuntime.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.ResourceRuntime build() {
      com.google.cloud.aiplatform.v1beta1.ResourceRuntime result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.ResourceRuntime buildPartial() {
      com.google.cloud.aiplatform.v1beta1.ResourceRuntime result =
          new com.google.cloud.aiplatform.v1beta1.ResourceRuntime(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.aiplatform.v1beta1.ResourceRuntime result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.accessUris_ = internalGetAccessUris();
        result.accessUris_.makeImmutable();
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.notebookRuntimeTemplate_ = notebookRuntimeTemplate_;
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
      if (other instanceof com.google.cloud.aiplatform.v1beta1.ResourceRuntime) {
        return mergeFrom((com.google.cloud.aiplatform.v1beta1.ResourceRuntime) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.aiplatform.v1beta1.ResourceRuntime other) {
      if (other == com.google.cloud.aiplatform.v1beta1.ResourceRuntime.getDefaultInstance())
        return this;
      internalGetMutableAccessUris().mergeFrom(other.internalGetAccessUris());
      bitField0_ |= 0x00000001;
      if (!other.getNotebookRuntimeTemplate().isEmpty()) {
        notebookRuntimeTemplate_ = other.notebookRuntimeTemplate_;
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
                com.google.protobuf.MapEntry<java.lang.String, java.lang.String> accessUris__ =
                    input.readMessage(
                        AccessUrisDefaultEntryHolder.defaultEntry.getParserForType(),
                        extensionRegistry);
                internalGetMutableAccessUris()
                    .getMutableMap()
                    .put(accessUris__.getKey(), accessUris__.getValue());
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                notebookRuntimeTemplate_ = input.readStringRequireUtf8();
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

    private com.google.protobuf.MapField<java.lang.String, java.lang.String> accessUris_;

    private com.google.protobuf.MapField<java.lang.String, java.lang.String>
        internalGetAccessUris() {
      if (accessUris_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            AccessUrisDefaultEntryHolder.defaultEntry);
      }
      return accessUris_;
    }

    private com.google.protobuf.MapField<java.lang.String, java.lang.String>
        internalGetMutableAccessUris() {
      if (accessUris_ == null) {
        accessUris_ =
            com.google.protobuf.MapField.newMapField(AccessUrisDefaultEntryHolder.defaultEntry);
      }
      if (!accessUris_.isMutable()) {
        accessUris_ = accessUris_.copy();
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return accessUris_;
    }

    public int getAccessUrisCount() {
      return internalGetAccessUris().getMap().size();
    }
    /**
     *
     *
     * <pre>
     * Output only. URIs for user to connect to the Cluster.
     * Example:
     * {
     *   "RAY_HEAD_NODE_INTERNAL_IP": "head-node-IP:10001"
     *   "RAY_DASHBOARD_URI": "ray-dashboard-address:8888"
     * }
     * </pre>
     *
     * <code>map&lt;string, string&gt; access_uris = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    @java.lang.Override
    public boolean containsAccessUris(java.lang.String key) {
      if (key == null) {
        throw new NullPointerException("map key");
      }
      return internalGetAccessUris().getMap().containsKey(key);
    }
    /** Use {@link #getAccessUrisMap()} instead. */
    @java.lang.Override
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, java.lang.String> getAccessUris() {
      return getAccessUrisMap();
    }
    /**
     *
     *
     * <pre>
     * Output only. URIs for user to connect to the Cluster.
     * Example:
     * {
     *   "RAY_HEAD_NODE_INTERNAL_IP": "head-node-IP:10001"
     *   "RAY_DASHBOARD_URI": "ray-dashboard-address:8888"
     * }
     * </pre>
     *
     * <code>map&lt;string, string&gt; access_uris = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    @java.lang.Override
    public java.util.Map<java.lang.String, java.lang.String> getAccessUrisMap() {
      return internalGetAccessUris().getMap();
    }
    /**
     *
     *
     * <pre>
     * Output only. URIs for user to connect to the Cluster.
     * Example:
     * {
     *   "RAY_HEAD_NODE_INTERNAL_IP": "head-node-IP:10001"
     *   "RAY_DASHBOARD_URI": "ray-dashboard-address:8888"
     * }
     * </pre>
     *
     * <code>map&lt;string, string&gt; access_uris = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    @java.lang.Override
    public /* nullable */ java.lang.String getAccessUrisOrDefault(
        java.lang.String key,
        /* nullable */
        java.lang.String defaultValue) {
      if (key == null) {
        throw new NullPointerException("map key");
      }
      java.util.Map<java.lang.String, java.lang.String> map = internalGetAccessUris().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     *
     *
     * <pre>
     * Output only. URIs for user to connect to the Cluster.
     * Example:
     * {
     *   "RAY_HEAD_NODE_INTERNAL_IP": "head-node-IP:10001"
     *   "RAY_DASHBOARD_URI": "ray-dashboard-address:8888"
     * }
     * </pre>
     *
     * <code>map&lt;string, string&gt; access_uris = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    @java.lang.Override
    public java.lang.String getAccessUrisOrThrow(java.lang.String key) {
      if (key == null) {
        throw new NullPointerException("map key");
      }
      java.util.Map<java.lang.String, java.lang.String> map = internalGetAccessUris().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
    }

    public Builder clearAccessUris() {
      bitField0_ = (bitField0_ & ~0x00000001);
      internalGetMutableAccessUris().getMutableMap().clear();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. URIs for user to connect to the Cluster.
     * Example:
     * {
     *   "RAY_HEAD_NODE_INTERNAL_IP": "head-node-IP:10001"
     *   "RAY_DASHBOARD_URI": "ray-dashboard-address:8888"
     * }
     * </pre>
     *
     * <code>map&lt;string, string&gt; access_uris = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public Builder removeAccessUris(java.lang.String key) {
      if (key == null) {
        throw new NullPointerException("map key");
      }
      internalGetMutableAccessUris().getMutableMap().remove(key);
      return this;
    }
    /** Use alternate mutation accessors instead. */
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, java.lang.String> getMutableAccessUris() {
      bitField0_ |= 0x00000001;
      return internalGetMutableAccessUris().getMutableMap();
    }
    /**
     *
     *
     * <pre>
     * Output only. URIs for user to connect to the Cluster.
     * Example:
     * {
     *   "RAY_HEAD_NODE_INTERNAL_IP": "head-node-IP:10001"
     *   "RAY_DASHBOARD_URI": "ray-dashboard-address:8888"
     * }
     * </pre>
     *
     * <code>map&lt;string, string&gt; access_uris = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public Builder putAccessUris(java.lang.String key, java.lang.String value) {
      if (key == null) {
        throw new NullPointerException("map key");
      }
      if (value == null) {
        throw new NullPointerException("map value");
      }
      internalGetMutableAccessUris().getMutableMap().put(key, value);
      bitField0_ |= 0x00000001;
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. URIs for user to connect to the Cluster.
     * Example:
     * {
     *   "RAY_HEAD_NODE_INTERNAL_IP": "head-node-IP:10001"
     *   "RAY_DASHBOARD_URI": "ray-dashboard-address:8888"
     * }
     * </pre>
     *
     * <code>map&lt;string, string&gt; access_uris = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public Builder putAllAccessUris(java.util.Map<java.lang.String, java.lang.String> values) {
      internalGetMutableAccessUris().getMutableMap().putAll(values);
      bitField0_ |= 0x00000001;
      return this;
    }

    private java.lang.Object notebookRuntimeTemplate_ = "";
    /**
     *
     *
     * <pre>
     * Output only. The resource name of NotebookRuntimeTemplate for the RoV
     * Persistent Cluster The NotebokRuntimeTemplate is created in the same VPC
     * (if set), and with the same Ray and Python version as the Persistent
     * Cluster. Example:
     *   "projects/1000/locations/us-central1/notebookRuntimeTemplates/abc123"
     * </pre>
     *
     * <code>
     * string notebook_runtime_template = 2 [deprecated = true, (.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @deprecated google.cloud.aiplatform.v1beta1.ResourceRuntime.notebook_runtime_template is
     *     deprecated. See google/cloud/aiplatform/v1beta1/persistent_resource.proto;l=290
     * @return The notebookRuntimeTemplate.
     */
    @java.lang.Deprecated
    public java.lang.String getNotebookRuntimeTemplate() {
      java.lang.Object ref = notebookRuntimeTemplate_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        notebookRuntimeTemplate_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Output only. The resource name of NotebookRuntimeTemplate for the RoV
     * Persistent Cluster The NotebokRuntimeTemplate is created in the same VPC
     * (if set), and with the same Ray and Python version as the Persistent
     * Cluster. Example:
     *   "projects/1000/locations/us-central1/notebookRuntimeTemplates/abc123"
     * </pre>
     *
     * <code>
     * string notebook_runtime_template = 2 [deprecated = true, (.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @deprecated google.cloud.aiplatform.v1beta1.ResourceRuntime.notebook_runtime_template is
     *     deprecated. See google/cloud/aiplatform/v1beta1/persistent_resource.proto;l=290
     * @return The bytes for notebookRuntimeTemplate.
     */
    @java.lang.Deprecated
    public com.google.protobuf.ByteString getNotebookRuntimeTemplateBytes() {
      java.lang.Object ref = notebookRuntimeTemplate_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        notebookRuntimeTemplate_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Output only. The resource name of NotebookRuntimeTemplate for the RoV
     * Persistent Cluster The NotebokRuntimeTemplate is created in the same VPC
     * (if set), and with the same Ray and Python version as the Persistent
     * Cluster. Example:
     *   "projects/1000/locations/us-central1/notebookRuntimeTemplates/abc123"
     * </pre>
     *
     * <code>
     * string notebook_runtime_template = 2 [deprecated = true, (.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @deprecated google.cloud.aiplatform.v1beta1.ResourceRuntime.notebook_runtime_template is
     *     deprecated. See google/cloud/aiplatform/v1beta1/persistent_resource.proto;l=290
     * @param value The notebookRuntimeTemplate to set.
     * @return This builder for chaining.
     */
    @java.lang.Deprecated
    public Builder setNotebookRuntimeTemplate(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      notebookRuntimeTemplate_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. The resource name of NotebookRuntimeTemplate for the RoV
     * Persistent Cluster The NotebokRuntimeTemplate is created in the same VPC
     * (if set), and with the same Ray and Python version as the Persistent
     * Cluster. Example:
     *   "projects/1000/locations/us-central1/notebookRuntimeTemplates/abc123"
     * </pre>
     *
     * <code>
     * string notebook_runtime_template = 2 [deprecated = true, (.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @deprecated google.cloud.aiplatform.v1beta1.ResourceRuntime.notebook_runtime_template is
     *     deprecated. See google/cloud/aiplatform/v1beta1/persistent_resource.proto;l=290
     * @return This builder for chaining.
     */
    @java.lang.Deprecated
    public Builder clearNotebookRuntimeTemplate() {
      notebookRuntimeTemplate_ = getDefaultInstance().getNotebookRuntimeTemplate();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. The resource name of NotebookRuntimeTemplate for the RoV
     * Persistent Cluster The NotebokRuntimeTemplate is created in the same VPC
     * (if set), and with the same Ray and Python version as the Persistent
     * Cluster. Example:
     *   "projects/1000/locations/us-central1/notebookRuntimeTemplates/abc123"
     * </pre>
     *
     * <code>
     * string notebook_runtime_template = 2 [deprecated = true, (.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @deprecated google.cloud.aiplatform.v1beta1.ResourceRuntime.notebook_runtime_template is
     *     deprecated. See google/cloud/aiplatform/v1beta1/persistent_resource.proto;l=290
     * @param value The bytes for notebookRuntimeTemplate to set.
     * @return This builder for chaining.
     */
    @java.lang.Deprecated
    public Builder setNotebookRuntimeTemplateBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      notebookRuntimeTemplate_ = value;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.aiplatform.v1beta1.ResourceRuntime)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.aiplatform.v1beta1.ResourceRuntime)
  private static final com.google.cloud.aiplatform.v1beta1.ResourceRuntime DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.aiplatform.v1beta1.ResourceRuntime();
  }

  public static com.google.cloud.aiplatform.v1beta1.ResourceRuntime getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ResourceRuntime> PARSER =
      new com.google.protobuf.AbstractParser<ResourceRuntime>() {
        @java.lang.Override
        public ResourceRuntime parsePartialFrom(
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

  public static com.google.protobuf.Parser<ResourceRuntime> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ResourceRuntime> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.aiplatform.v1beta1.ResourceRuntime getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
