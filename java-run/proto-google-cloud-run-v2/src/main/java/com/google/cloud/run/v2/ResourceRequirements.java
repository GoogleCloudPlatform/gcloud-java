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
// source: google/cloud/run/v2/k8s.min.proto

package com.google.cloud.run.v2;

/**
 *
 *
 * <pre>
 * ResourceRequirements describes the compute resource requirements.
 * </pre>
 *
 * Protobuf type {@code google.cloud.run.v2.ResourceRequirements}
 */
public final class ResourceRequirements extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.run.v2.ResourceRequirements)
    ResourceRequirementsOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ResourceRequirements.newBuilder() to construct.
  private ResourceRequirements(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ResourceRequirements() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ResourceRequirements();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.run.v2.K8sMinProto
        .internal_static_google_cloud_run_v2_ResourceRequirements_descriptor;
  }

  @SuppressWarnings({"rawtypes"})
  @java.lang.Override
  protected com.google.protobuf.MapField internalGetMapField(int number) {
    switch (number) {
      case 1:
        return internalGetLimits();
      default:
        throw new RuntimeException("Invalid map field number: " + number);
    }
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.run.v2.K8sMinProto
        .internal_static_google_cloud_run_v2_ResourceRequirements_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.run.v2.ResourceRequirements.class,
            com.google.cloud.run.v2.ResourceRequirements.Builder.class);
  }

  public static final int LIMITS_FIELD_NUMBER = 1;

  private static final class LimitsDefaultEntryHolder {
    static final com.google.protobuf.MapEntry<java.lang.String, java.lang.String> defaultEntry =
        com.google.protobuf.MapEntry.<java.lang.String, java.lang.String>newDefaultInstance(
            com.google.cloud.run.v2.K8sMinProto
                .internal_static_google_cloud_run_v2_ResourceRequirements_LimitsEntry_descriptor,
            com.google.protobuf.WireFormat.FieldType.STRING,
            "",
            com.google.protobuf.WireFormat.FieldType.STRING,
            "");
  }

  @SuppressWarnings("serial")
  private com.google.protobuf.MapField<java.lang.String, java.lang.String> limits_;

  private com.google.protobuf.MapField<java.lang.String, java.lang.String> internalGetLimits() {
    if (limits_ == null) {
      return com.google.protobuf.MapField.emptyMapField(LimitsDefaultEntryHolder.defaultEntry);
    }
    return limits_;
  }

  public int getLimitsCount() {
    return internalGetLimits().getMap().size();
  }
  /**
   *
   *
   * <pre>
   * Only memory and CPU are supported. Note: The only
   * supported values for CPU are '1', '2',  '4', and '8'. Setting 4 CPU
   * requires at least 2Gi of memory. The values of the map is string form of
   * the 'quantity' k8s type:
   * https://github.com/kubernetes/kubernetes/blob/master/staging/src/k8s.io/apimachinery/pkg/api/resource/quantity.go
   * </pre>
   *
   * <code>map&lt;string, string&gt; limits = 1;</code>
   */
  @java.lang.Override
  public boolean containsLimits(java.lang.String key) {
    if (key == null) {
      throw new NullPointerException("map key");
    }
    return internalGetLimits().getMap().containsKey(key);
  }
  /** Use {@link #getLimitsMap()} instead. */
  @java.lang.Override
  @java.lang.Deprecated
  public java.util.Map<java.lang.String, java.lang.String> getLimits() {
    return getLimitsMap();
  }
  /**
   *
   *
   * <pre>
   * Only memory and CPU are supported. Note: The only
   * supported values for CPU are '1', '2',  '4', and '8'. Setting 4 CPU
   * requires at least 2Gi of memory. The values of the map is string form of
   * the 'quantity' k8s type:
   * https://github.com/kubernetes/kubernetes/blob/master/staging/src/k8s.io/apimachinery/pkg/api/resource/quantity.go
   * </pre>
   *
   * <code>map&lt;string, string&gt; limits = 1;</code>
   */
  @java.lang.Override
  public java.util.Map<java.lang.String, java.lang.String> getLimitsMap() {
    return internalGetLimits().getMap();
  }
  /**
   *
   *
   * <pre>
   * Only memory and CPU are supported. Note: The only
   * supported values for CPU are '1', '2',  '4', and '8'. Setting 4 CPU
   * requires at least 2Gi of memory. The values of the map is string form of
   * the 'quantity' k8s type:
   * https://github.com/kubernetes/kubernetes/blob/master/staging/src/k8s.io/apimachinery/pkg/api/resource/quantity.go
   * </pre>
   *
   * <code>map&lt;string, string&gt; limits = 1;</code>
   */
  @java.lang.Override
  public /* nullable */ java.lang.String getLimitsOrDefault(
      java.lang.String key,
      /* nullable */
      java.lang.String defaultValue) {
    if (key == null) {
      throw new NullPointerException("map key");
    }
    java.util.Map<java.lang.String, java.lang.String> map = internalGetLimits().getMap();
    return map.containsKey(key) ? map.get(key) : defaultValue;
  }
  /**
   *
   *
   * <pre>
   * Only memory and CPU are supported. Note: The only
   * supported values for CPU are '1', '2',  '4', and '8'. Setting 4 CPU
   * requires at least 2Gi of memory. The values of the map is string form of
   * the 'quantity' k8s type:
   * https://github.com/kubernetes/kubernetes/blob/master/staging/src/k8s.io/apimachinery/pkg/api/resource/quantity.go
   * </pre>
   *
   * <code>map&lt;string, string&gt; limits = 1;</code>
   */
  @java.lang.Override
  public java.lang.String getLimitsOrThrow(java.lang.String key) {
    if (key == null) {
      throw new NullPointerException("map key");
    }
    java.util.Map<java.lang.String, java.lang.String> map = internalGetLimits().getMap();
    if (!map.containsKey(key)) {
      throw new java.lang.IllegalArgumentException();
    }
    return map.get(key);
  }

  public static final int CPU_IDLE_FIELD_NUMBER = 2;
  private boolean cpuIdle_ = false;
  /**
   *
   *
   * <pre>
   * Determines whether CPU should be throttled or not outside of requests.
   * </pre>
   *
   * <code>bool cpu_idle = 2;</code>
   *
   * @return The cpuIdle.
   */
  @java.lang.Override
  public boolean getCpuIdle() {
    return cpuIdle_;
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
        output, internalGetLimits(), LimitsDefaultEntryHolder.defaultEntry, 1);
    if (cpuIdle_ != false) {
      output.writeBool(2, cpuIdle_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (java.util.Map.Entry<java.lang.String, java.lang.String> entry :
        internalGetLimits().getMap().entrySet()) {
      com.google.protobuf.MapEntry<java.lang.String, java.lang.String> limits__ =
          LimitsDefaultEntryHolder.defaultEntry
              .newBuilderForType()
              .setKey(entry.getKey())
              .setValue(entry.getValue())
              .build();
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, limits__);
    }
    if (cpuIdle_ != false) {
      size += com.google.protobuf.CodedOutputStream.computeBoolSize(2, cpuIdle_);
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
    if (!(obj instanceof com.google.cloud.run.v2.ResourceRequirements)) {
      return super.equals(obj);
    }
    com.google.cloud.run.v2.ResourceRequirements other =
        (com.google.cloud.run.v2.ResourceRequirements) obj;

    if (!internalGetLimits().equals(other.internalGetLimits())) return false;
    if (getCpuIdle() != other.getCpuIdle()) return false;
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
    if (!internalGetLimits().getMap().isEmpty()) {
      hash = (37 * hash) + LIMITS_FIELD_NUMBER;
      hash = (53 * hash) + internalGetLimits().hashCode();
    }
    hash = (37 * hash) + CPU_IDLE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getCpuIdle());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.run.v2.ResourceRequirements parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.run.v2.ResourceRequirements parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.run.v2.ResourceRequirements parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.run.v2.ResourceRequirements parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.run.v2.ResourceRequirements parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.run.v2.ResourceRequirements parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.run.v2.ResourceRequirements parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.run.v2.ResourceRequirements parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.run.v2.ResourceRequirements parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.run.v2.ResourceRequirements parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.run.v2.ResourceRequirements parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.run.v2.ResourceRequirements parseFrom(
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

  public static Builder newBuilder(com.google.cloud.run.v2.ResourceRequirements prototype) {
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
   * ResourceRequirements describes the compute resource requirements.
   * </pre>
   *
   * Protobuf type {@code google.cloud.run.v2.ResourceRequirements}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.run.v2.ResourceRequirements)
      com.google.cloud.run.v2.ResourceRequirementsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.run.v2.K8sMinProto
          .internal_static_google_cloud_run_v2_ResourceRequirements_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMapField(int number) {
      switch (number) {
        case 1:
          return internalGetLimits();
        default:
          throw new RuntimeException("Invalid map field number: " + number);
      }
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMutableMapField(int number) {
      switch (number) {
        case 1:
          return internalGetMutableLimits();
        default:
          throw new RuntimeException("Invalid map field number: " + number);
      }
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.run.v2.K8sMinProto
          .internal_static_google_cloud_run_v2_ResourceRequirements_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.run.v2.ResourceRequirements.class,
              com.google.cloud.run.v2.ResourceRequirements.Builder.class);
    }

    // Construct using com.google.cloud.run.v2.ResourceRequirements.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      internalGetMutableLimits().clear();
      cpuIdle_ = false;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.run.v2.K8sMinProto
          .internal_static_google_cloud_run_v2_ResourceRequirements_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.run.v2.ResourceRequirements getDefaultInstanceForType() {
      return com.google.cloud.run.v2.ResourceRequirements.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.run.v2.ResourceRequirements build() {
      com.google.cloud.run.v2.ResourceRequirements result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.run.v2.ResourceRequirements buildPartial() {
      com.google.cloud.run.v2.ResourceRequirements result =
          new com.google.cloud.run.v2.ResourceRequirements(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.run.v2.ResourceRequirements result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.limits_ = internalGetLimits();
        result.limits_.makeImmutable();
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.cpuIdle_ = cpuIdle_;
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
      if (other instanceof com.google.cloud.run.v2.ResourceRequirements) {
        return mergeFrom((com.google.cloud.run.v2.ResourceRequirements) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.run.v2.ResourceRequirements other) {
      if (other == com.google.cloud.run.v2.ResourceRequirements.getDefaultInstance()) return this;
      internalGetMutableLimits().mergeFrom(other.internalGetLimits());
      bitField0_ |= 0x00000001;
      if (other.getCpuIdle() != false) {
        setCpuIdle(other.getCpuIdle());
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
                com.google.protobuf.MapEntry<java.lang.String, java.lang.String> limits__ =
                    input.readMessage(
                        LimitsDefaultEntryHolder.defaultEntry.getParserForType(),
                        extensionRegistry);
                internalGetMutableLimits()
                    .getMutableMap()
                    .put(limits__.getKey(), limits__.getValue());
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 16:
              {
                cpuIdle_ = input.readBool();
                bitField0_ |= 0x00000002;
                break;
              } // case 16
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

    private com.google.protobuf.MapField<java.lang.String, java.lang.String> limits_;

    private com.google.protobuf.MapField<java.lang.String, java.lang.String> internalGetLimits() {
      if (limits_ == null) {
        return com.google.protobuf.MapField.emptyMapField(LimitsDefaultEntryHolder.defaultEntry);
      }
      return limits_;
    }

    private com.google.protobuf.MapField<java.lang.String, java.lang.String>
        internalGetMutableLimits() {
      if (limits_ == null) {
        limits_ = com.google.protobuf.MapField.newMapField(LimitsDefaultEntryHolder.defaultEntry);
      }
      if (!limits_.isMutable()) {
        limits_ = limits_.copy();
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return limits_;
    }

    public int getLimitsCount() {
      return internalGetLimits().getMap().size();
    }
    /**
     *
     *
     * <pre>
     * Only memory and CPU are supported. Note: The only
     * supported values for CPU are '1', '2',  '4', and '8'. Setting 4 CPU
     * requires at least 2Gi of memory. The values of the map is string form of
     * the 'quantity' k8s type:
     * https://github.com/kubernetes/kubernetes/blob/master/staging/src/k8s.io/apimachinery/pkg/api/resource/quantity.go
     * </pre>
     *
     * <code>map&lt;string, string&gt; limits = 1;</code>
     */
    @java.lang.Override
    public boolean containsLimits(java.lang.String key) {
      if (key == null) {
        throw new NullPointerException("map key");
      }
      return internalGetLimits().getMap().containsKey(key);
    }
    /** Use {@link #getLimitsMap()} instead. */
    @java.lang.Override
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, java.lang.String> getLimits() {
      return getLimitsMap();
    }
    /**
     *
     *
     * <pre>
     * Only memory and CPU are supported. Note: The only
     * supported values for CPU are '1', '2',  '4', and '8'. Setting 4 CPU
     * requires at least 2Gi of memory. The values of the map is string form of
     * the 'quantity' k8s type:
     * https://github.com/kubernetes/kubernetes/blob/master/staging/src/k8s.io/apimachinery/pkg/api/resource/quantity.go
     * </pre>
     *
     * <code>map&lt;string, string&gt; limits = 1;</code>
     */
    @java.lang.Override
    public java.util.Map<java.lang.String, java.lang.String> getLimitsMap() {
      return internalGetLimits().getMap();
    }
    /**
     *
     *
     * <pre>
     * Only memory and CPU are supported. Note: The only
     * supported values for CPU are '1', '2',  '4', and '8'. Setting 4 CPU
     * requires at least 2Gi of memory. The values of the map is string form of
     * the 'quantity' k8s type:
     * https://github.com/kubernetes/kubernetes/blob/master/staging/src/k8s.io/apimachinery/pkg/api/resource/quantity.go
     * </pre>
     *
     * <code>map&lt;string, string&gt; limits = 1;</code>
     */
    @java.lang.Override
    public /* nullable */ java.lang.String getLimitsOrDefault(
        java.lang.String key,
        /* nullable */
        java.lang.String defaultValue) {
      if (key == null) {
        throw new NullPointerException("map key");
      }
      java.util.Map<java.lang.String, java.lang.String> map = internalGetLimits().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     *
     *
     * <pre>
     * Only memory and CPU are supported. Note: The only
     * supported values for CPU are '1', '2',  '4', and '8'. Setting 4 CPU
     * requires at least 2Gi of memory. The values of the map is string form of
     * the 'quantity' k8s type:
     * https://github.com/kubernetes/kubernetes/blob/master/staging/src/k8s.io/apimachinery/pkg/api/resource/quantity.go
     * </pre>
     *
     * <code>map&lt;string, string&gt; limits = 1;</code>
     */
    @java.lang.Override
    public java.lang.String getLimitsOrThrow(java.lang.String key) {
      if (key == null) {
        throw new NullPointerException("map key");
      }
      java.util.Map<java.lang.String, java.lang.String> map = internalGetLimits().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
    }

    public Builder clearLimits() {
      bitField0_ = (bitField0_ & ~0x00000001);
      internalGetMutableLimits().getMutableMap().clear();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Only memory and CPU are supported. Note: The only
     * supported values for CPU are '1', '2',  '4', and '8'. Setting 4 CPU
     * requires at least 2Gi of memory. The values of the map is string form of
     * the 'quantity' k8s type:
     * https://github.com/kubernetes/kubernetes/blob/master/staging/src/k8s.io/apimachinery/pkg/api/resource/quantity.go
     * </pre>
     *
     * <code>map&lt;string, string&gt; limits = 1;</code>
     */
    public Builder removeLimits(java.lang.String key) {
      if (key == null) {
        throw new NullPointerException("map key");
      }
      internalGetMutableLimits().getMutableMap().remove(key);
      return this;
    }
    /** Use alternate mutation accessors instead. */
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, java.lang.String> getMutableLimits() {
      bitField0_ |= 0x00000001;
      return internalGetMutableLimits().getMutableMap();
    }
    /**
     *
     *
     * <pre>
     * Only memory and CPU are supported. Note: The only
     * supported values for CPU are '1', '2',  '4', and '8'. Setting 4 CPU
     * requires at least 2Gi of memory. The values of the map is string form of
     * the 'quantity' k8s type:
     * https://github.com/kubernetes/kubernetes/blob/master/staging/src/k8s.io/apimachinery/pkg/api/resource/quantity.go
     * </pre>
     *
     * <code>map&lt;string, string&gt; limits = 1;</code>
     */
    public Builder putLimits(java.lang.String key, java.lang.String value) {
      if (key == null) {
        throw new NullPointerException("map key");
      }
      if (value == null) {
        throw new NullPointerException("map value");
      }
      internalGetMutableLimits().getMutableMap().put(key, value);
      bitField0_ |= 0x00000001;
      return this;
    }
    /**
     *
     *
     * <pre>
     * Only memory and CPU are supported. Note: The only
     * supported values for CPU are '1', '2',  '4', and '8'. Setting 4 CPU
     * requires at least 2Gi of memory. The values of the map is string form of
     * the 'quantity' k8s type:
     * https://github.com/kubernetes/kubernetes/blob/master/staging/src/k8s.io/apimachinery/pkg/api/resource/quantity.go
     * </pre>
     *
     * <code>map&lt;string, string&gt; limits = 1;</code>
     */
    public Builder putAllLimits(java.util.Map<java.lang.String, java.lang.String> values) {
      internalGetMutableLimits().getMutableMap().putAll(values);
      bitField0_ |= 0x00000001;
      return this;
    }

    private boolean cpuIdle_;
    /**
     *
     *
     * <pre>
     * Determines whether CPU should be throttled or not outside of requests.
     * </pre>
     *
     * <code>bool cpu_idle = 2;</code>
     *
     * @return The cpuIdle.
     */
    @java.lang.Override
    public boolean getCpuIdle() {
      return cpuIdle_;
    }
    /**
     *
     *
     * <pre>
     * Determines whether CPU should be throttled or not outside of requests.
     * </pre>
     *
     * <code>bool cpu_idle = 2;</code>
     *
     * @param value The cpuIdle to set.
     * @return This builder for chaining.
     */
    public Builder setCpuIdle(boolean value) {

      cpuIdle_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Determines whether CPU should be throttled or not outside of requests.
     * </pre>
     *
     * <code>bool cpu_idle = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearCpuIdle() {
      bitField0_ = (bitField0_ & ~0x00000002);
      cpuIdle_ = false;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.run.v2.ResourceRequirements)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.run.v2.ResourceRequirements)
  private static final com.google.cloud.run.v2.ResourceRequirements DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.run.v2.ResourceRequirements();
  }

  public static com.google.cloud.run.v2.ResourceRequirements getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ResourceRequirements> PARSER =
      new com.google.protobuf.AbstractParser<ResourceRequirements>() {
        @java.lang.Override
        public ResourceRequirements parsePartialFrom(
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

  public static com.google.protobuf.Parser<ResourceRequirements> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ResourceRequirements> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.run.v2.ResourceRequirements getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
