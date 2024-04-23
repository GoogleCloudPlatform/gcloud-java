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
// source: google/cloud/orchestration/airflow/service/v1/environments.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.orchestration.airflow.service.v1;

/**
 *
 *
 * <pre>
 * User workloads ConfigMap used by Airflow tasks that run with Kubernetes
 * executor or KubernetesPodOperator.
 * </pre>
 *
 * Protobuf type {@code google.cloud.orchestration.airflow.service.v1.UserWorkloadsConfigMap}
 */
public final class UserWorkloadsConfigMap extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.orchestration.airflow.service.v1.UserWorkloadsConfigMap)
    UserWorkloadsConfigMapOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use UserWorkloadsConfigMap.newBuilder() to construct.
  private UserWorkloadsConfigMap(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private UserWorkloadsConfigMap() {
    name_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new UserWorkloadsConfigMap();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.orchestration.airflow.service.v1.EnvironmentsOuterClass
        .internal_static_google_cloud_orchestration_airflow_service_v1_UserWorkloadsConfigMap_descriptor;
  }

  @SuppressWarnings({"rawtypes"})
  @java.lang.Override
  protected com.google.protobuf.MapFieldReflectionAccessor internalGetMapFieldReflection(
      int number) {
    switch (number) {
      case 2:
        return internalGetData();
      default:
        throw new RuntimeException("Invalid map field number: " + number);
    }
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.orchestration.airflow.service.v1.EnvironmentsOuterClass
        .internal_static_google_cloud_orchestration_airflow_service_v1_UserWorkloadsConfigMap_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.orchestration.airflow.service.v1.UserWorkloadsConfigMap.class,
            com.google.cloud.orchestration.airflow.service.v1.UserWorkloadsConfigMap.Builder.class);
  }

  public static final int NAME_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object name_ = "";
  /**
   *
   *
   * <pre>
   * Identifier. The resource name of the ConfigMap, in the form:
   * "projects/{projectId}/locations/{locationId}/environments/{environmentId}/userWorkloadsConfigMaps/{userWorkloadsConfigMapId}"
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = IDENTIFIER];</code>
   *
   * @return The name.
   */
  @java.lang.Override
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Identifier. The resource name of the ConfigMap, in the form:
   * "projects/{projectId}/locations/{locationId}/environments/{environmentId}/userWorkloadsConfigMaps/{userWorkloadsConfigMapId}"
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = IDENTIFIER];</code>
   *
   * @return The bytes for name.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DATA_FIELD_NUMBER = 2;

  private static final class DataDefaultEntryHolder {
    static final com.google.protobuf.MapEntry<java.lang.String, java.lang.String> defaultEntry =
        com.google.protobuf.MapEntry.<java.lang.String, java.lang.String>newDefaultInstance(
            com.google.cloud.orchestration.airflow.service.v1.EnvironmentsOuterClass
                .internal_static_google_cloud_orchestration_airflow_service_v1_UserWorkloadsConfigMap_DataEntry_descriptor,
            com.google.protobuf.WireFormat.FieldType.STRING,
            "",
            com.google.protobuf.WireFormat.FieldType.STRING,
            "");
  }

  @SuppressWarnings("serial")
  private com.google.protobuf.MapField<java.lang.String, java.lang.String> data_;

  private com.google.protobuf.MapField<java.lang.String, java.lang.String> internalGetData() {
    if (data_ == null) {
      return com.google.protobuf.MapField.emptyMapField(DataDefaultEntryHolder.defaultEntry);
    }
    return data_;
  }

  public int getDataCount() {
    return internalGetData().getMap().size();
  }
  /**
   *
   *
   * <pre>
   * Optional. The "data" field of Kubernetes ConfigMap, organized in key-value
   * pairs. For details see:
   * https://kubernetes.io/docs/concepts/configuration/configmap/
   * </pre>
   *
   * <code>map&lt;string, string&gt; data = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  @java.lang.Override
  public boolean containsData(java.lang.String key) {
    if (key == null) {
      throw new NullPointerException("map key");
    }
    return internalGetData().getMap().containsKey(key);
  }
  /** Use {@link #getDataMap()} instead. */
  @java.lang.Override
  @java.lang.Deprecated
  public java.util.Map<java.lang.String, java.lang.String> getData() {
    return getDataMap();
  }
  /**
   *
   *
   * <pre>
   * Optional. The "data" field of Kubernetes ConfigMap, organized in key-value
   * pairs. For details see:
   * https://kubernetes.io/docs/concepts/configuration/configmap/
   * </pre>
   *
   * <code>map&lt;string, string&gt; data = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  @java.lang.Override
  public java.util.Map<java.lang.String, java.lang.String> getDataMap() {
    return internalGetData().getMap();
  }
  /**
   *
   *
   * <pre>
   * Optional. The "data" field of Kubernetes ConfigMap, organized in key-value
   * pairs. For details see:
   * https://kubernetes.io/docs/concepts/configuration/configmap/
   * </pre>
   *
   * <code>map&lt;string, string&gt; data = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  @java.lang.Override
  public /* nullable */ java.lang.String getDataOrDefault(
      java.lang.String key,
      /* nullable */
      java.lang.String defaultValue) {
    if (key == null) {
      throw new NullPointerException("map key");
    }
    java.util.Map<java.lang.String, java.lang.String> map = internalGetData().getMap();
    return map.containsKey(key) ? map.get(key) : defaultValue;
  }
  /**
   *
   *
   * <pre>
   * Optional. The "data" field of Kubernetes ConfigMap, organized in key-value
   * pairs. For details see:
   * https://kubernetes.io/docs/concepts/configuration/configmap/
   * </pre>
   *
   * <code>map&lt;string, string&gt; data = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  @java.lang.Override
  public java.lang.String getDataOrThrow(java.lang.String key) {
    if (key == null) {
      throw new NullPointerException("map key");
    }
    java.util.Map<java.lang.String, java.lang.String> map = internalGetData().getMap();
    if (!map.containsKey(key)) {
      throw new java.lang.IllegalArgumentException();
    }
    return map.get(key);
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
    }
    com.google.protobuf.GeneratedMessageV3.serializeStringMapTo(
        output, internalGetData(), DataDefaultEntryHolder.defaultEntry, 2);
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
    }
    for (java.util.Map.Entry<java.lang.String, java.lang.String> entry :
        internalGetData().getMap().entrySet()) {
      com.google.protobuf.MapEntry<java.lang.String, java.lang.String> data__ =
          DataDefaultEntryHolder.defaultEntry
              .newBuilderForType()
              .setKey(entry.getKey())
              .setValue(entry.getValue())
              .build();
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, data__);
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
    if (!(obj
        instanceof com.google.cloud.orchestration.airflow.service.v1.UserWorkloadsConfigMap)) {
      return super.equals(obj);
    }
    com.google.cloud.orchestration.airflow.service.v1.UserWorkloadsConfigMap other =
        (com.google.cloud.orchestration.airflow.service.v1.UserWorkloadsConfigMap) obj;

    if (!getName().equals(other.getName())) return false;
    if (!internalGetData().equals(other.internalGetData())) return false;
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
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    if (!internalGetData().getMap().isEmpty()) {
      hash = (37 * hash) + DATA_FIELD_NUMBER;
      hash = (53 * hash) + internalGetData().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.orchestration.airflow.service.v1.UserWorkloadsConfigMap parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.orchestration.airflow.service.v1.UserWorkloadsConfigMap parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.orchestration.airflow.service.v1.UserWorkloadsConfigMap parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.orchestration.airflow.service.v1.UserWorkloadsConfigMap parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.orchestration.airflow.service.v1.UserWorkloadsConfigMap parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.orchestration.airflow.service.v1.UserWorkloadsConfigMap parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.orchestration.airflow.service.v1.UserWorkloadsConfigMap parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.orchestration.airflow.service.v1.UserWorkloadsConfigMap parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.orchestration.airflow.service.v1.UserWorkloadsConfigMap
      parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.orchestration.airflow.service.v1.UserWorkloadsConfigMap
      parseDelimitedFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.orchestration.airflow.service.v1.UserWorkloadsConfigMap parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.orchestration.airflow.service.v1.UserWorkloadsConfigMap parseFrom(
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
      com.google.cloud.orchestration.airflow.service.v1.UserWorkloadsConfigMap prototype) {
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
   * User workloads ConfigMap used by Airflow tasks that run with Kubernetes
   * executor or KubernetesPodOperator.
   * </pre>
   *
   * Protobuf type {@code google.cloud.orchestration.airflow.service.v1.UserWorkloadsConfigMap}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.orchestration.airflow.service.v1.UserWorkloadsConfigMap)
      com.google.cloud.orchestration.airflow.service.v1.UserWorkloadsConfigMapOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.orchestration.airflow.service.v1.EnvironmentsOuterClass
          .internal_static_google_cloud_orchestration_airflow_service_v1_UserWorkloadsConfigMap_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapFieldReflectionAccessor internalGetMapFieldReflection(
        int number) {
      switch (number) {
        case 2:
          return internalGetData();
        default:
          throw new RuntimeException("Invalid map field number: " + number);
      }
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapFieldReflectionAccessor internalGetMutableMapFieldReflection(
        int number) {
      switch (number) {
        case 2:
          return internalGetMutableData();
        default:
          throw new RuntimeException("Invalid map field number: " + number);
      }
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.orchestration.airflow.service.v1.EnvironmentsOuterClass
          .internal_static_google_cloud_orchestration_airflow_service_v1_UserWorkloadsConfigMap_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.orchestration.airflow.service.v1.UserWorkloadsConfigMap.class,
              com.google.cloud.orchestration.airflow.service.v1.UserWorkloadsConfigMap.Builder
                  .class);
    }

    // Construct using
    // com.google.cloud.orchestration.airflow.service.v1.UserWorkloadsConfigMap.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      name_ = "";
      internalGetMutableData().clear();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.orchestration.airflow.service.v1.EnvironmentsOuterClass
          .internal_static_google_cloud_orchestration_airflow_service_v1_UserWorkloadsConfigMap_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.orchestration.airflow.service.v1.UserWorkloadsConfigMap
        getDefaultInstanceForType() {
      return com.google.cloud.orchestration.airflow.service.v1.UserWorkloadsConfigMap
          .getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.orchestration.airflow.service.v1.UserWorkloadsConfigMap build() {
      com.google.cloud.orchestration.airflow.service.v1.UserWorkloadsConfigMap result =
          buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.orchestration.airflow.service.v1.UserWorkloadsConfigMap buildPartial() {
      com.google.cloud.orchestration.airflow.service.v1.UserWorkloadsConfigMap result =
          new com.google.cloud.orchestration.airflow.service.v1.UserWorkloadsConfigMap(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(
        com.google.cloud.orchestration.airflow.service.v1.UserWorkloadsConfigMap result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.name_ = name_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.data_ = internalGetData();
        result.data_.makeImmutable();
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
      if (other
          instanceof com.google.cloud.orchestration.airflow.service.v1.UserWorkloadsConfigMap) {
        return mergeFrom(
            (com.google.cloud.orchestration.airflow.service.v1.UserWorkloadsConfigMap) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.cloud.orchestration.airflow.service.v1.UserWorkloadsConfigMap other) {
      if (other
          == com.google.cloud.orchestration.airflow.service.v1.UserWorkloadsConfigMap
              .getDefaultInstance()) return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      internalGetMutableData().mergeFrom(other.internalGetData());
      bitField0_ |= 0x00000002;
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
                name_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                com.google.protobuf.MapEntry<java.lang.String, java.lang.String> data__ =
                    input.readMessage(
                        DataDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
                internalGetMutableData().getMutableMap().put(data__.getKey(), data__.getValue());
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

    private java.lang.Object name_ = "";
    /**
     *
     *
     * <pre>
     * Identifier. The resource name of the ConfigMap, in the form:
     * "projects/{projectId}/locations/{locationId}/environments/{environmentId}/userWorkloadsConfigMaps/{userWorkloadsConfigMapId}"
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = IDENTIFIER];</code>
     *
     * @return The name.
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Identifier. The resource name of the ConfigMap, in the form:
     * "projects/{projectId}/locations/{locationId}/environments/{environmentId}/userWorkloadsConfigMaps/{userWorkloadsConfigMapId}"
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = IDENTIFIER];</code>
     *
     * @return The bytes for name.
     */
    public com.google.protobuf.ByteString getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Identifier. The resource name of the ConfigMap, in the form:
     * "projects/{projectId}/locations/{locationId}/environments/{environmentId}/userWorkloadsConfigMaps/{userWorkloadsConfigMapId}"
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = IDENTIFIER];</code>
     *
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      name_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Identifier. The resource name of the ConfigMap, in the form:
     * "projects/{projectId}/locations/{locationId}/environments/{environmentId}/userWorkloadsConfigMaps/{userWorkloadsConfigMapId}"
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = IDENTIFIER];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearName() {
      name_ = getDefaultInstance().getName();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Identifier. The resource name of the ConfigMap, in the form:
     * "projects/{projectId}/locations/{locationId}/environments/{environmentId}/userWorkloadsConfigMaps/{userWorkloadsConfigMapId}"
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = IDENTIFIER];</code>
     *
     * @param value The bytes for name to set.
     * @return This builder for chaining.
     */
    public Builder setNameBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      name_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private com.google.protobuf.MapField<java.lang.String, java.lang.String> data_;

    private com.google.protobuf.MapField<java.lang.String, java.lang.String> internalGetData() {
      if (data_ == null) {
        return com.google.protobuf.MapField.emptyMapField(DataDefaultEntryHolder.defaultEntry);
      }
      return data_;
    }

    private com.google.protobuf.MapField<java.lang.String, java.lang.String>
        internalGetMutableData() {
      if (data_ == null) {
        data_ = com.google.protobuf.MapField.newMapField(DataDefaultEntryHolder.defaultEntry);
      }
      if (!data_.isMutable()) {
        data_ = data_.copy();
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return data_;
    }

    public int getDataCount() {
      return internalGetData().getMap().size();
    }
    /**
     *
     *
     * <pre>
     * Optional. The "data" field of Kubernetes ConfigMap, organized in key-value
     * pairs. For details see:
     * https://kubernetes.io/docs/concepts/configuration/configmap/
     * </pre>
     *
     * <code>map&lt;string, string&gt; data = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     */
    @java.lang.Override
    public boolean containsData(java.lang.String key) {
      if (key == null) {
        throw new NullPointerException("map key");
      }
      return internalGetData().getMap().containsKey(key);
    }
    /** Use {@link #getDataMap()} instead. */
    @java.lang.Override
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, java.lang.String> getData() {
      return getDataMap();
    }
    /**
     *
     *
     * <pre>
     * Optional. The "data" field of Kubernetes ConfigMap, organized in key-value
     * pairs. For details see:
     * https://kubernetes.io/docs/concepts/configuration/configmap/
     * </pre>
     *
     * <code>map&lt;string, string&gt; data = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     */
    @java.lang.Override
    public java.util.Map<java.lang.String, java.lang.String> getDataMap() {
      return internalGetData().getMap();
    }
    /**
     *
     *
     * <pre>
     * Optional. The "data" field of Kubernetes ConfigMap, organized in key-value
     * pairs. For details see:
     * https://kubernetes.io/docs/concepts/configuration/configmap/
     * </pre>
     *
     * <code>map&lt;string, string&gt; data = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     */
    @java.lang.Override
    public /* nullable */ java.lang.String getDataOrDefault(
        java.lang.String key,
        /* nullable */
        java.lang.String defaultValue) {
      if (key == null) {
        throw new NullPointerException("map key");
      }
      java.util.Map<java.lang.String, java.lang.String> map = internalGetData().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     *
     *
     * <pre>
     * Optional. The "data" field of Kubernetes ConfigMap, organized in key-value
     * pairs. For details see:
     * https://kubernetes.io/docs/concepts/configuration/configmap/
     * </pre>
     *
     * <code>map&lt;string, string&gt; data = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     */
    @java.lang.Override
    public java.lang.String getDataOrThrow(java.lang.String key) {
      if (key == null) {
        throw new NullPointerException("map key");
      }
      java.util.Map<java.lang.String, java.lang.String> map = internalGetData().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
    }

    public Builder clearData() {
      bitField0_ = (bitField0_ & ~0x00000002);
      internalGetMutableData().getMutableMap().clear();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. The "data" field of Kubernetes ConfigMap, organized in key-value
     * pairs. For details see:
     * https://kubernetes.io/docs/concepts/configuration/configmap/
     * </pre>
     *
     * <code>map&lt;string, string&gt; data = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     */
    public Builder removeData(java.lang.String key) {
      if (key == null) {
        throw new NullPointerException("map key");
      }
      internalGetMutableData().getMutableMap().remove(key);
      return this;
    }
    /** Use alternate mutation accessors instead. */
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, java.lang.String> getMutableData() {
      bitField0_ |= 0x00000002;
      return internalGetMutableData().getMutableMap();
    }
    /**
     *
     *
     * <pre>
     * Optional. The "data" field of Kubernetes ConfigMap, organized in key-value
     * pairs. For details see:
     * https://kubernetes.io/docs/concepts/configuration/configmap/
     * </pre>
     *
     * <code>map&lt;string, string&gt; data = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     */
    public Builder putData(java.lang.String key, java.lang.String value) {
      if (key == null) {
        throw new NullPointerException("map key");
      }
      if (value == null) {
        throw new NullPointerException("map value");
      }
      internalGetMutableData().getMutableMap().put(key, value);
      bitField0_ |= 0x00000002;
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. The "data" field of Kubernetes ConfigMap, organized in key-value
     * pairs. For details see:
     * https://kubernetes.io/docs/concepts/configuration/configmap/
     * </pre>
     *
     * <code>map&lt;string, string&gt; data = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     */
    public Builder putAllData(java.util.Map<java.lang.String, java.lang.String> values) {
      internalGetMutableData().getMutableMap().putAll(values);
      bitField0_ |= 0x00000002;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.orchestration.airflow.service.v1.UserWorkloadsConfigMap)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.orchestration.airflow.service.v1.UserWorkloadsConfigMap)
  private static final com.google.cloud.orchestration.airflow.service.v1.UserWorkloadsConfigMap
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE =
        new com.google.cloud.orchestration.airflow.service.v1.UserWorkloadsConfigMap();
  }

  public static com.google.cloud.orchestration.airflow.service.v1.UserWorkloadsConfigMap
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UserWorkloadsConfigMap> PARSER =
      new com.google.protobuf.AbstractParser<UserWorkloadsConfigMap>() {
        @java.lang.Override
        public UserWorkloadsConfigMap parsePartialFrom(
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

  public static com.google.protobuf.Parser<UserWorkloadsConfigMap> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UserWorkloadsConfigMap> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.orchestration.airflow.service.v1.UserWorkloadsConfigMap
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
