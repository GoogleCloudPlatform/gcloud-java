// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/gaming/v1beta/game_server_clusters.proto

package com.google.cloud.gaming.v1beta;

/**
 * <pre>
 * Request message for GameServerClustersService.CreateGameServerCluster.
 * </pre>
 *
 * Protobuf type {@code google.cloud.gaming.v1beta.CreateGameServerClusterRequest}
 */
public final class CreateGameServerClusterRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.gaming.v1beta.CreateGameServerClusterRequest)
    CreateGameServerClusterRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CreateGameServerClusterRequest.newBuilder() to construct.
  private CreateGameServerClusterRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CreateGameServerClusterRequest() {
    parent_ = "";
    gameServerClusterId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CreateGameServerClusterRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.gaming.v1beta.GameServerClusters.internal_static_google_cloud_gaming_v1beta_CreateGameServerClusterRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.gaming.v1beta.GameServerClusters.internal_static_google_cloud_gaming_v1beta_CreateGameServerClusterRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.gaming.v1beta.CreateGameServerClusterRequest.class, com.google.cloud.gaming.v1beta.CreateGameServerClusterRequest.Builder.class);
  }

  public static final int PARENT_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object parent_ = "";
  /**
   * <pre>
   * Required. The parent resource name. Uses the form:
   * `projects/{project}/locations/{location}/realms/{realm-id}`.
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
   * Required. The parent resource name. Uses the form:
   * `projects/{project}/locations/{location}/realms/{realm-id}`.
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

  public static final int GAME_SERVER_CLUSTER_ID_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object gameServerClusterId_ = "";
  /**
   * <pre>
   * Required. The ID of the game server cluster resource to be created.
   * </pre>
   *
   * <code>string game_server_cluster_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The gameServerClusterId.
   */
  @java.lang.Override
  public java.lang.String getGameServerClusterId() {
    java.lang.Object ref = gameServerClusterId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      gameServerClusterId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Required. The ID of the game server cluster resource to be created.
   * </pre>
   *
   * <code>string game_server_cluster_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for gameServerClusterId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getGameServerClusterIdBytes() {
    java.lang.Object ref = gameServerClusterId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      gameServerClusterId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int GAME_SERVER_CLUSTER_FIELD_NUMBER = 3;
  private com.google.cloud.gaming.v1beta.GameServerCluster gameServerCluster_;
  /**
   * <pre>
   * Required. The game server cluster resource to be created.
   * </pre>
   *
   * <code>.google.cloud.gaming.v1beta.GameServerCluster game_server_cluster = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the gameServerCluster field is set.
   */
  @java.lang.Override
  public boolean hasGameServerCluster() {
    return gameServerCluster_ != null;
  }
  /**
   * <pre>
   * Required. The game server cluster resource to be created.
   * </pre>
   *
   * <code>.google.cloud.gaming.v1beta.GameServerCluster game_server_cluster = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The gameServerCluster.
   */
  @java.lang.Override
  public com.google.cloud.gaming.v1beta.GameServerCluster getGameServerCluster() {
    return gameServerCluster_ == null ? com.google.cloud.gaming.v1beta.GameServerCluster.getDefaultInstance() : gameServerCluster_;
  }
  /**
   * <pre>
   * Required. The game server cluster resource to be created.
   * </pre>
   *
   * <code>.google.cloud.gaming.v1beta.GameServerCluster game_server_cluster = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  @java.lang.Override
  public com.google.cloud.gaming.v1beta.GameServerClusterOrBuilder getGameServerClusterOrBuilder() {
    return gameServerCluster_ == null ? com.google.cloud.gaming.v1beta.GameServerCluster.getDefaultInstance() : gameServerCluster_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(gameServerClusterId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, gameServerClusterId_);
    }
    if (gameServerCluster_ != null) {
      output.writeMessage(3, getGameServerCluster());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(parent_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, parent_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(gameServerClusterId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, gameServerClusterId_);
    }
    if (gameServerCluster_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getGameServerCluster());
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
    if (!(obj instanceof com.google.cloud.gaming.v1beta.CreateGameServerClusterRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.gaming.v1beta.CreateGameServerClusterRequest other = (com.google.cloud.gaming.v1beta.CreateGameServerClusterRequest) obj;

    if (!getParent()
        .equals(other.getParent())) return false;
    if (!getGameServerClusterId()
        .equals(other.getGameServerClusterId())) return false;
    if (hasGameServerCluster() != other.hasGameServerCluster()) return false;
    if (hasGameServerCluster()) {
      if (!getGameServerCluster()
          .equals(other.getGameServerCluster())) return false;
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
    hash = (37 * hash) + PARENT_FIELD_NUMBER;
    hash = (53 * hash) + getParent().hashCode();
    hash = (37 * hash) + GAME_SERVER_CLUSTER_ID_FIELD_NUMBER;
    hash = (53 * hash) + getGameServerClusterId().hashCode();
    if (hasGameServerCluster()) {
      hash = (37 * hash) + GAME_SERVER_CLUSTER_FIELD_NUMBER;
      hash = (53 * hash) + getGameServerCluster().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.gaming.v1beta.CreateGameServerClusterRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.gaming.v1beta.CreateGameServerClusterRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.gaming.v1beta.CreateGameServerClusterRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.gaming.v1beta.CreateGameServerClusterRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.gaming.v1beta.CreateGameServerClusterRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.gaming.v1beta.CreateGameServerClusterRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.gaming.v1beta.CreateGameServerClusterRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.gaming.v1beta.CreateGameServerClusterRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.gaming.v1beta.CreateGameServerClusterRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.gaming.v1beta.CreateGameServerClusterRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.gaming.v1beta.CreateGameServerClusterRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.gaming.v1beta.CreateGameServerClusterRequest parseFrom(
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
  public static Builder newBuilder(com.google.cloud.gaming.v1beta.CreateGameServerClusterRequest prototype) {
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
   * Request message for GameServerClustersService.CreateGameServerCluster.
   * </pre>
   *
   * Protobuf type {@code google.cloud.gaming.v1beta.CreateGameServerClusterRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.gaming.v1beta.CreateGameServerClusterRequest)
      com.google.cloud.gaming.v1beta.CreateGameServerClusterRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.gaming.v1beta.GameServerClusters.internal_static_google_cloud_gaming_v1beta_CreateGameServerClusterRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.gaming.v1beta.GameServerClusters.internal_static_google_cloud_gaming_v1beta_CreateGameServerClusterRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.gaming.v1beta.CreateGameServerClusterRequest.class, com.google.cloud.gaming.v1beta.CreateGameServerClusterRequest.Builder.class);
    }

    // Construct using com.google.cloud.gaming.v1beta.CreateGameServerClusterRequest.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      parent_ = "";
      gameServerClusterId_ = "";
      gameServerCluster_ = null;
      if (gameServerClusterBuilder_ != null) {
        gameServerClusterBuilder_.dispose();
        gameServerClusterBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.gaming.v1beta.GameServerClusters.internal_static_google_cloud_gaming_v1beta_CreateGameServerClusterRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.gaming.v1beta.CreateGameServerClusterRequest getDefaultInstanceForType() {
      return com.google.cloud.gaming.v1beta.CreateGameServerClusterRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.gaming.v1beta.CreateGameServerClusterRequest build() {
      com.google.cloud.gaming.v1beta.CreateGameServerClusterRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.gaming.v1beta.CreateGameServerClusterRequest buildPartial() {
      com.google.cloud.gaming.v1beta.CreateGameServerClusterRequest result = new com.google.cloud.gaming.v1beta.CreateGameServerClusterRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.gaming.v1beta.CreateGameServerClusterRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.parent_ = parent_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.gameServerClusterId_ = gameServerClusterId_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.gameServerCluster_ = gameServerClusterBuilder_ == null
            ? gameServerCluster_
            : gameServerClusterBuilder_.build();
      }
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
      if (other instanceof com.google.cloud.gaming.v1beta.CreateGameServerClusterRequest) {
        return mergeFrom((com.google.cloud.gaming.v1beta.CreateGameServerClusterRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.gaming.v1beta.CreateGameServerClusterRequest other) {
      if (other == com.google.cloud.gaming.v1beta.CreateGameServerClusterRequest.getDefaultInstance()) return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getGameServerClusterId().isEmpty()) {
        gameServerClusterId_ = other.gameServerClusterId_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (other.hasGameServerCluster()) {
        mergeGameServerCluster(other.getGameServerCluster());
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
            case 10: {
              parent_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              gameServerClusterId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              input.readMessage(
                  getGameServerClusterFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000004;
              break;
            } // case 26
            default: {
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

    private java.lang.Object parent_ = "";
    /**
     * <pre>
     * Required. The parent resource name. Uses the form:
     * `projects/{project}/locations/{location}/realms/{realm-id}`.
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
     * Required. The parent resource name. Uses the form:
     * `projects/{project}/locations/{location}/realms/{realm-id}`.
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
     * Required. The parent resource name. Uses the form:
     * `projects/{project}/locations/{location}/realms/{realm-id}`.
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @param value The parent to set.
     * @return This builder for chaining.
     */
    public Builder setParent(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      parent_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The parent resource name. Uses the form:
     * `projects/{project}/locations/{location}/realms/{realm-id}`.
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearParent() {
      parent_ = getDefaultInstance().getParent();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The parent resource name. Uses the form:
     * `projects/{project}/locations/{location}/realms/{realm-id}`.
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @param value The bytes for parent to set.
     * @return This builder for chaining.
     */
    public Builder setParentBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      parent_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object gameServerClusterId_ = "";
    /**
     * <pre>
     * Required. The ID of the game server cluster resource to be created.
     * </pre>
     *
     * <code>string game_server_cluster_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The gameServerClusterId.
     */
    public java.lang.String getGameServerClusterId() {
      java.lang.Object ref = gameServerClusterId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        gameServerClusterId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Required. The ID of the game server cluster resource to be created.
     * </pre>
     *
     * <code>string game_server_cluster_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The bytes for gameServerClusterId.
     */
    public com.google.protobuf.ByteString
        getGameServerClusterIdBytes() {
      java.lang.Object ref = gameServerClusterId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        gameServerClusterId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Required. The ID of the game server cluster resource to be created.
     * </pre>
     *
     * <code>string game_server_cluster_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The gameServerClusterId to set.
     * @return This builder for chaining.
     */
    public Builder setGameServerClusterId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      gameServerClusterId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The ID of the game server cluster resource to be created.
     * </pre>
     *
     * <code>string game_server_cluster_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return This builder for chaining.
     */
    public Builder clearGameServerClusterId() {
      gameServerClusterId_ = getDefaultInstance().getGameServerClusterId();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The ID of the game server cluster resource to be created.
     * </pre>
     *
     * <code>string game_server_cluster_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The bytes for gameServerClusterId to set.
     * @return This builder for chaining.
     */
    public Builder setGameServerClusterIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      gameServerClusterId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private com.google.cloud.gaming.v1beta.GameServerCluster gameServerCluster_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.gaming.v1beta.GameServerCluster, com.google.cloud.gaming.v1beta.GameServerCluster.Builder, com.google.cloud.gaming.v1beta.GameServerClusterOrBuilder> gameServerClusterBuilder_;
    /**
     * <pre>
     * Required. The game server cluster resource to be created.
     * </pre>
     *
     * <code>.google.cloud.gaming.v1beta.GameServerCluster game_server_cluster = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return Whether the gameServerCluster field is set.
     */
    public boolean hasGameServerCluster() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <pre>
     * Required. The game server cluster resource to be created.
     * </pre>
     *
     * <code>.google.cloud.gaming.v1beta.GameServerCluster game_server_cluster = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The gameServerCluster.
     */
    public com.google.cloud.gaming.v1beta.GameServerCluster getGameServerCluster() {
      if (gameServerClusterBuilder_ == null) {
        return gameServerCluster_ == null ? com.google.cloud.gaming.v1beta.GameServerCluster.getDefaultInstance() : gameServerCluster_;
      } else {
        return gameServerClusterBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Required. The game server cluster resource to be created.
     * </pre>
     *
     * <code>.google.cloud.gaming.v1beta.GameServerCluster game_server_cluster = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setGameServerCluster(com.google.cloud.gaming.v1beta.GameServerCluster value) {
      if (gameServerClusterBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        gameServerCluster_ = value;
      } else {
        gameServerClusterBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The game server cluster resource to be created.
     * </pre>
     *
     * <code>.google.cloud.gaming.v1beta.GameServerCluster game_server_cluster = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setGameServerCluster(
        com.google.cloud.gaming.v1beta.GameServerCluster.Builder builderForValue) {
      if (gameServerClusterBuilder_ == null) {
        gameServerCluster_ = builderForValue.build();
      } else {
        gameServerClusterBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The game server cluster resource to be created.
     * </pre>
     *
     * <code>.google.cloud.gaming.v1beta.GameServerCluster game_server_cluster = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder mergeGameServerCluster(com.google.cloud.gaming.v1beta.GameServerCluster value) {
      if (gameServerClusterBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0) &&
          gameServerCluster_ != null &&
          gameServerCluster_ != com.google.cloud.gaming.v1beta.GameServerCluster.getDefaultInstance()) {
          getGameServerClusterBuilder().mergeFrom(value);
        } else {
          gameServerCluster_ = value;
        }
      } else {
        gameServerClusterBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The game server cluster resource to be created.
     * </pre>
     *
     * <code>.google.cloud.gaming.v1beta.GameServerCluster game_server_cluster = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder clearGameServerCluster() {
      bitField0_ = (bitField0_ & ~0x00000004);
      gameServerCluster_ = null;
      if (gameServerClusterBuilder_ != null) {
        gameServerClusterBuilder_.dispose();
        gameServerClusterBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The game server cluster resource to be created.
     * </pre>
     *
     * <code>.google.cloud.gaming.v1beta.GameServerCluster game_server_cluster = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.cloud.gaming.v1beta.GameServerCluster.Builder getGameServerClusterBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getGameServerClusterFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Required. The game server cluster resource to be created.
     * </pre>
     *
     * <code>.google.cloud.gaming.v1beta.GameServerCluster game_server_cluster = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.cloud.gaming.v1beta.GameServerClusterOrBuilder getGameServerClusterOrBuilder() {
      if (gameServerClusterBuilder_ != null) {
        return gameServerClusterBuilder_.getMessageOrBuilder();
      } else {
        return gameServerCluster_ == null ?
            com.google.cloud.gaming.v1beta.GameServerCluster.getDefaultInstance() : gameServerCluster_;
      }
    }
    /**
     * <pre>
     * Required. The game server cluster resource to be created.
     * </pre>
     *
     * <code>.google.cloud.gaming.v1beta.GameServerCluster game_server_cluster = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.gaming.v1beta.GameServerCluster, com.google.cloud.gaming.v1beta.GameServerCluster.Builder, com.google.cloud.gaming.v1beta.GameServerClusterOrBuilder> 
        getGameServerClusterFieldBuilder() {
      if (gameServerClusterBuilder_ == null) {
        gameServerClusterBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.gaming.v1beta.GameServerCluster, com.google.cloud.gaming.v1beta.GameServerCluster.Builder, com.google.cloud.gaming.v1beta.GameServerClusterOrBuilder>(
                getGameServerCluster(),
                getParentForChildren(),
                isClean());
        gameServerCluster_ = null;
      }
      return gameServerClusterBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.gaming.v1beta.CreateGameServerClusterRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.gaming.v1beta.CreateGameServerClusterRequest)
  private static final com.google.cloud.gaming.v1beta.CreateGameServerClusterRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.gaming.v1beta.CreateGameServerClusterRequest();
  }

  public static com.google.cloud.gaming.v1beta.CreateGameServerClusterRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateGameServerClusterRequest>
      PARSER = new com.google.protobuf.AbstractParser<CreateGameServerClusterRequest>() {
    @java.lang.Override
    public CreateGameServerClusterRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<CreateGameServerClusterRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateGameServerClusterRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.gaming.v1beta.CreateGameServerClusterRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

