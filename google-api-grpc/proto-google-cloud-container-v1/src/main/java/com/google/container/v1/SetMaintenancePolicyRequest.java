// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/container/v1/cluster_service.proto

package com.google.container.v1;

/**
 * <pre>
 * SetMaintenancePolicyRequest sets the maintenance policy for a cluster.
 * </pre>
 *
 * Protobuf type {@code google.container.v1.SetMaintenancePolicyRequest}
 */
public  final class SetMaintenancePolicyRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.container.v1.SetMaintenancePolicyRequest)
    SetMaintenancePolicyRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SetMaintenancePolicyRequest.newBuilder() to construct.
  private SetMaintenancePolicyRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SetMaintenancePolicyRequest() {
    projectId_ = "";
    zone_ = "";
    clusterId_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private SetMaintenancePolicyRequest(
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
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            projectId_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            zone_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            clusterId_ = s;
            break;
          }
          case 34: {
            com.google.container.v1.MaintenancePolicy.Builder subBuilder = null;
            if (maintenancePolicy_ != null) {
              subBuilder = maintenancePolicy_.toBuilder();
            }
            maintenancePolicy_ = input.readMessage(com.google.container.v1.MaintenancePolicy.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(maintenancePolicy_);
              maintenancePolicy_ = subBuilder.buildPartial();
            }

            break;
          }
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
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
    return com.google.container.v1.ClusterServiceProto.internal_static_google_container_v1_SetMaintenancePolicyRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.container.v1.ClusterServiceProto.internal_static_google_container_v1_SetMaintenancePolicyRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.container.v1.SetMaintenancePolicyRequest.class, com.google.container.v1.SetMaintenancePolicyRequest.Builder.class);
  }

  public static final int PROJECT_ID_FIELD_NUMBER = 1;
  private volatile java.lang.Object projectId_;
  /**
   * <pre>
   * The Google Developers Console [project ID or project
   * number](https://support.google.com/cloud/answer/6158840).
   * </pre>
   *
   * <code>string project_id = 1;</code>
   */
  public java.lang.String getProjectId() {
    java.lang.Object ref = projectId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      projectId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The Google Developers Console [project ID or project
   * number](https://support.google.com/cloud/answer/6158840).
   * </pre>
   *
   * <code>string project_id = 1;</code>
   */
  public com.google.protobuf.ByteString
      getProjectIdBytes() {
    java.lang.Object ref = projectId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      projectId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ZONE_FIELD_NUMBER = 2;
  private volatile java.lang.Object zone_;
  /**
   * <pre>
   * The name of the Google Compute Engine
   * [zone](/compute/docs/zones#available) in which the cluster
   * resides.
   * </pre>
   *
   * <code>string zone = 2;</code>
   */
  public java.lang.String getZone() {
    java.lang.Object ref = zone_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      zone_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The name of the Google Compute Engine
   * [zone](/compute/docs/zones#available) in which the cluster
   * resides.
   * </pre>
   *
   * <code>string zone = 2;</code>
   */
  public com.google.protobuf.ByteString
      getZoneBytes() {
    java.lang.Object ref = zone_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      zone_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CLUSTER_ID_FIELD_NUMBER = 3;
  private volatile java.lang.Object clusterId_;
  /**
   * <pre>
   * The name of the cluster to update.
   * </pre>
   *
   * <code>string cluster_id = 3;</code>
   */
  public java.lang.String getClusterId() {
    java.lang.Object ref = clusterId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      clusterId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The name of the cluster to update.
   * </pre>
   *
   * <code>string cluster_id = 3;</code>
   */
  public com.google.protobuf.ByteString
      getClusterIdBytes() {
    java.lang.Object ref = clusterId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      clusterId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int MAINTENANCE_POLICY_FIELD_NUMBER = 4;
  private com.google.container.v1.MaintenancePolicy maintenancePolicy_;
  /**
   * <pre>
   * The maintenance policy to be set for the cluster. An empty field
   * clears the existing maintenance policy.
   * </pre>
   *
   * <code>.google.container.v1.MaintenancePolicy maintenance_policy = 4;</code>
   */
  public boolean hasMaintenancePolicy() {
    return maintenancePolicy_ != null;
  }
  /**
   * <pre>
   * The maintenance policy to be set for the cluster. An empty field
   * clears the existing maintenance policy.
   * </pre>
   *
   * <code>.google.container.v1.MaintenancePolicy maintenance_policy = 4;</code>
   */
  public com.google.container.v1.MaintenancePolicy getMaintenancePolicy() {
    return maintenancePolicy_ == null ? com.google.container.v1.MaintenancePolicy.getDefaultInstance() : maintenancePolicy_;
  }
  /**
   * <pre>
   * The maintenance policy to be set for the cluster. An empty field
   * clears the existing maintenance policy.
   * </pre>
   *
   * <code>.google.container.v1.MaintenancePolicy maintenance_policy = 4;</code>
   */
  public com.google.container.v1.MaintenancePolicyOrBuilder getMaintenancePolicyOrBuilder() {
    return getMaintenancePolicy();
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
    if (!getProjectIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, projectId_);
    }
    if (!getZoneBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, zone_);
    }
    if (!getClusterIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, clusterId_);
    }
    if (maintenancePolicy_ != null) {
      output.writeMessage(4, getMaintenancePolicy());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getProjectIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, projectId_);
    }
    if (!getZoneBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, zone_);
    }
    if (!getClusterIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, clusterId_);
    }
    if (maintenancePolicy_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(4, getMaintenancePolicy());
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
    if (!(obj instanceof com.google.container.v1.SetMaintenancePolicyRequest)) {
      return super.equals(obj);
    }
    com.google.container.v1.SetMaintenancePolicyRequest other = (com.google.container.v1.SetMaintenancePolicyRequest) obj;

    boolean result = true;
    result = result && getProjectId()
        .equals(other.getProjectId());
    result = result && getZone()
        .equals(other.getZone());
    result = result && getClusterId()
        .equals(other.getClusterId());
    result = result && (hasMaintenancePolicy() == other.hasMaintenancePolicy());
    if (hasMaintenancePolicy()) {
      result = result && getMaintenancePolicy()
          .equals(other.getMaintenancePolicy());
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
    hash = (37 * hash) + PROJECT_ID_FIELD_NUMBER;
    hash = (53 * hash) + getProjectId().hashCode();
    hash = (37 * hash) + ZONE_FIELD_NUMBER;
    hash = (53 * hash) + getZone().hashCode();
    hash = (37 * hash) + CLUSTER_ID_FIELD_NUMBER;
    hash = (53 * hash) + getClusterId().hashCode();
    if (hasMaintenancePolicy()) {
      hash = (37 * hash) + MAINTENANCE_POLICY_FIELD_NUMBER;
      hash = (53 * hash) + getMaintenancePolicy().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.container.v1.SetMaintenancePolicyRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.container.v1.SetMaintenancePolicyRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.container.v1.SetMaintenancePolicyRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.container.v1.SetMaintenancePolicyRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.container.v1.SetMaintenancePolicyRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.container.v1.SetMaintenancePolicyRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.container.v1.SetMaintenancePolicyRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.container.v1.SetMaintenancePolicyRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.container.v1.SetMaintenancePolicyRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.container.v1.SetMaintenancePolicyRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.container.v1.SetMaintenancePolicyRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.container.v1.SetMaintenancePolicyRequest parseFrom(
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
  public static Builder newBuilder(com.google.container.v1.SetMaintenancePolicyRequest prototype) {
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
   * SetMaintenancePolicyRequest sets the maintenance policy for a cluster.
   * </pre>
   *
   * Protobuf type {@code google.container.v1.SetMaintenancePolicyRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.container.v1.SetMaintenancePolicyRequest)
      com.google.container.v1.SetMaintenancePolicyRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.container.v1.ClusterServiceProto.internal_static_google_container_v1_SetMaintenancePolicyRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.container.v1.ClusterServiceProto.internal_static_google_container_v1_SetMaintenancePolicyRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.container.v1.SetMaintenancePolicyRequest.class, com.google.container.v1.SetMaintenancePolicyRequest.Builder.class);
    }

    // Construct using com.google.container.v1.SetMaintenancePolicyRequest.newBuilder()
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
      projectId_ = "";

      zone_ = "";

      clusterId_ = "";

      if (maintenancePolicyBuilder_ == null) {
        maintenancePolicy_ = null;
      } else {
        maintenancePolicy_ = null;
        maintenancePolicyBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.container.v1.ClusterServiceProto.internal_static_google_container_v1_SetMaintenancePolicyRequest_descriptor;
    }

    @java.lang.Override
    public com.google.container.v1.SetMaintenancePolicyRequest getDefaultInstanceForType() {
      return com.google.container.v1.SetMaintenancePolicyRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.container.v1.SetMaintenancePolicyRequest build() {
      com.google.container.v1.SetMaintenancePolicyRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.container.v1.SetMaintenancePolicyRequest buildPartial() {
      com.google.container.v1.SetMaintenancePolicyRequest result = new com.google.container.v1.SetMaintenancePolicyRequest(this);
      result.projectId_ = projectId_;
      result.zone_ = zone_;
      result.clusterId_ = clusterId_;
      if (maintenancePolicyBuilder_ == null) {
        result.maintenancePolicy_ = maintenancePolicy_;
      } else {
        result.maintenancePolicy_ = maintenancePolicyBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.container.v1.SetMaintenancePolicyRequest) {
        return mergeFrom((com.google.container.v1.SetMaintenancePolicyRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.container.v1.SetMaintenancePolicyRequest other) {
      if (other == com.google.container.v1.SetMaintenancePolicyRequest.getDefaultInstance()) return this;
      if (!other.getProjectId().isEmpty()) {
        projectId_ = other.projectId_;
        onChanged();
      }
      if (!other.getZone().isEmpty()) {
        zone_ = other.zone_;
        onChanged();
      }
      if (!other.getClusterId().isEmpty()) {
        clusterId_ = other.clusterId_;
        onChanged();
      }
      if (other.hasMaintenancePolicy()) {
        mergeMaintenancePolicy(other.getMaintenancePolicy());
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
      com.google.container.v1.SetMaintenancePolicyRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.container.v1.SetMaintenancePolicyRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object projectId_ = "";
    /**
     * <pre>
     * The Google Developers Console [project ID or project
     * number](https://support.google.com/cloud/answer/6158840).
     * </pre>
     *
     * <code>string project_id = 1;</code>
     */
    public java.lang.String getProjectId() {
      java.lang.Object ref = projectId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        projectId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The Google Developers Console [project ID or project
     * number](https://support.google.com/cloud/answer/6158840).
     * </pre>
     *
     * <code>string project_id = 1;</code>
     */
    public com.google.protobuf.ByteString
        getProjectIdBytes() {
      java.lang.Object ref = projectId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        projectId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The Google Developers Console [project ID or project
     * number](https://support.google.com/cloud/answer/6158840).
     * </pre>
     *
     * <code>string project_id = 1;</code>
     */
    public Builder setProjectId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      projectId_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The Google Developers Console [project ID or project
     * number](https://support.google.com/cloud/answer/6158840).
     * </pre>
     *
     * <code>string project_id = 1;</code>
     */
    public Builder clearProjectId() {
      
      projectId_ = getDefaultInstance().getProjectId();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The Google Developers Console [project ID or project
     * number](https://support.google.com/cloud/answer/6158840).
     * </pre>
     *
     * <code>string project_id = 1;</code>
     */
    public Builder setProjectIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      projectId_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object zone_ = "";
    /**
     * <pre>
     * The name of the Google Compute Engine
     * [zone](/compute/docs/zones#available) in which the cluster
     * resides.
     * </pre>
     *
     * <code>string zone = 2;</code>
     */
    public java.lang.String getZone() {
      java.lang.Object ref = zone_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        zone_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The name of the Google Compute Engine
     * [zone](/compute/docs/zones#available) in which the cluster
     * resides.
     * </pre>
     *
     * <code>string zone = 2;</code>
     */
    public com.google.protobuf.ByteString
        getZoneBytes() {
      java.lang.Object ref = zone_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        zone_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The name of the Google Compute Engine
     * [zone](/compute/docs/zones#available) in which the cluster
     * resides.
     * </pre>
     *
     * <code>string zone = 2;</code>
     */
    public Builder setZone(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      zone_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The name of the Google Compute Engine
     * [zone](/compute/docs/zones#available) in which the cluster
     * resides.
     * </pre>
     *
     * <code>string zone = 2;</code>
     */
    public Builder clearZone() {
      
      zone_ = getDefaultInstance().getZone();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The name of the Google Compute Engine
     * [zone](/compute/docs/zones#available) in which the cluster
     * resides.
     * </pre>
     *
     * <code>string zone = 2;</code>
     */
    public Builder setZoneBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      zone_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object clusterId_ = "";
    /**
     * <pre>
     * The name of the cluster to update.
     * </pre>
     *
     * <code>string cluster_id = 3;</code>
     */
    public java.lang.String getClusterId() {
      java.lang.Object ref = clusterId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        clusterId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The name of the cluster to update.
     * </pre>
     *
     * <code>string cluster_id = 3;</code>
     */
    public com.google.protobuf.ByteString
        getClusterIdBytes() {
      java.lang.Object ref = clusterId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        clusterId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The name of the cluster to update.
     * </pre>
     *
     * <code>string cluster_id = 3;</code>
     */
    public Builder setClusterId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      clusterId_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The name of the cluster to update.
     * </pre>
     *
     * <code>string cluster_id = 3;</code>
     */
    public Builder clearClusterId() {
      
      clusterId_ = getDefaultInstance().getClusterId();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The name of the cluster to update.
     * </pre>
     *
     * <code>string cluster_id = 3;</code>
     */
    public Builder setClusterIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      clusterId_ = value;
      onChanged();
      return this;
    }

    private com.google.container.v1.MaintenancePolicy maintenancePolicy_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.container.v1.MaintenancePolicy, com.google.container.v1.MaintenancePolicy.Builder, com.google.container.v1.MaintenancePolicyOrBuilder> maintenancePolicyBuilder_;
    /**
     * <pre>
     * The maintenance policy to be set for the cluster. An empty field
     * clears the existing maintenance policy.
     * </pre>
     *
     * <code>.google.container.v1.MaintenancePolicy maintenance_policy = 4;</code>
     */
    public boolean hasMaintenancePolicy() {
      return maintenancePolicyBuilder_ != null || maintenancePolicy_ != null;
    }
    /**
     * <pre>
     * The maintenance policy to be set for the cluster. An empty field
     * clears the existing maintenance policy.
     * </pre>
     *
     * <code>.google.container.v1.MaintenancePolicy maintenance_policy = 4;</code>
     */
    public com.google.container.v1.MaintenancePolicy getMaintenancePolicy() {
      if (maintenancePolicyBuilder_ == null) {
        return maintenancePolicy_ == null ? com.google.container.v1.MaintenancePolicy.getDefaultInstance() : maintenancePolicy_;
      } else {
        return maintenancePolicyBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The maintenance policy to be set for the cluster. An empty field
     * clears the existing maintenance policy.
     * </pre>
     *
     * <code>.google.container.v1.MaintenancePolicy maintenance_policy = 4;</code>
     */
    public Builder setMaintenancePolicy(com.google.container.v1.MaintenancePolicy value) {
      if (maintenancePolicyBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        maintenancePolicy_ = value;
        onChanged();
      } else {
        maintenancePolicyBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * The maintenance policy to be set for the cluster. An empty field
     * clears the existing maintenance policy.
     * </pre>
     *
     * <code>.google.container.v1.MaintenancePolicy maintenance_policy = 4;</code>
     */
    public Builder setMaintenancePolicy(
        com.google.container.v1.MaintenancePolicy.Builder builderForValue) {
      if (maintenancePolicyBuilder_ == null) {
        maintenancePolicy_ = builderForValue.build();
        onChanged();
      } else {
        maintenancePolicyBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * The maintenance policy to be set for the cluster. An empty field
     * clears the existing maintenance policy.
     * </pre>
     *
     * <code>.google.container.v1.MaintenancePolicy maintenance_policy = 4;</code>
     */
    public Builder mergeMaintenancePolicy(com.google.container.v1.MaintenancePolicy value) {
      if (maintenancePolicyBuilder_ == null) {
        if (maintenancePolicy_ != null) {
          maintenancePolicy_ =
            com.google.container.v1.MaintenancePolicy.newBuilder(maintenancePolicy_).mergeFrom(value).buildPartial();
        } else {
          maintenancePolicy_ = value;
        }
        onChanged();
      } else {
        maintenancePolicyBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * The maintenance policy to be set for the cluster. An empty field
     * clears the existing maintenance policy.
     * </pre>
     *
     * <code>.google.container.v1.MaintenancePolicy maintenance_policy = 4;</code>
     */
    public Builder clearMaintenancePolicy() {
      if (maintenancePolicyBuilder_ == null) {
        maintenancePolicy_ = null;
        onChanged();
      } else {
        maintenancePolicy_ = null;
        maintenancePolicyBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * The maintenance policy to be set for the cluster. An empty field
     * clears the existing maintenance policy.
     * </pre>
     *
     * <code>.google.container.v1.MaintenancePolicy maintenance_policy = 4;</code>
     */
    public com.google.container.v1.MaintenancePolicy.Builder getMaintenancePolicyBuilder() {
      
      onChanged();
      return getMaintenancePolicyFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The maintenance policy to be set for the cluster. An empty field
     * clears the existing maintenance policy.
     * </pre>
     *
     * <code>.google.container.v1.MaintenancePolicy maintenance_policy = 4;</code>
     */
    public com.google.container.v1.MaintenancePolicyOrBuilder getMaintenancePolicyOrBuilder() {
      if (maintenancePolicyBuilder_ != null) {
        return maintenancePolicyBuilder_.getMessageOrBuilder();
      } else {
        return maintenancePolicy_ == null ?
            com.google.container.v1.MaintenancePolicy.getDefaultInstance() : maintenancePolicy_;
      }
    }
    /**
     * <pre>
     * The maintenance policy to be set for the cluster. An empty field
     * clears the existing maintenance policy.
     * </pre>
     *
     * <code>.google.container.v1.MaintenancePolicy maintenance_policy = 4;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.container.v1.MaintenancePolicy, com.google.container.v1.MaintenancePolicy.Builder, com.google.container.v1.MaintenancePolicyOrBuilder> 
        getMaintenancePolicyFieldBuilder() {
      if (maintenancePolicyBuilder_ == null) {
        maintenancePolicyBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.container.v1.MaintenancePolicy, com.google.container.v1.MaintenancePolicy.Builder, com.google.container.v1.MaintenancePolicyOrBuilder>(
                getMaintenancePolicy(),
                getParentForChildren(),
                isClean());
        maintenancePolicy_ = null;
      }
      return maintenancePolicyBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:google.container.v1.SetMaintenancePolicyRequest)
  }

  // @@protoc_insertion_point(class_scope:google.container.v1.SetMaintenancePolicyRequest)
  private static final com.google.container.v1.SetMaintenancePolicyRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.container.v1.SetMaintenancePolicyRequest();
  }

  public static com.google.container.v1.SetMaintenancePolicyRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SetMaintenancePolicyRequest>
      PARSER = new com.google.protobuf.AbstractParser<SetMaintenancePolicyRequest>() {
    @java.lang.Override
    public SetMaintenancePolicyRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new SetMaintenancePolicyRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<SetMaintenancePolicyRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SetMaintenancePolicyRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.container.v1.SetMaintenancePolicyRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

