// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/resourcemanager/v3/projects.proto

package com.google.cloud.resourcemanager.v3;

/**
 * <pre>
 * The request sent to the
 * [CreateProject][google.cloud.resourcemanager.v3.Projects.CreateProject]
 * method.
 * </pre>
 *
 * Protobuf type {@code google.cloud.resourcemanager.v3.CreateProjectRequest}
 */
public final class CreateProjectRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.resourcemanager.v3.CreateProjectRequest)
    CreateProjectRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CreateProjectRequest.newBuilder() to construct.
  private CreateProjectRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CreateProjectRequest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CreateProjectRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.resourcemanager.v3.ProjectsProto.internal_static_google_cloud_resourcemanager_v3_CreateProjectRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.resourcemanager.v3.ProjectsProto.internal_static_google_cloud_resourcemanager_v3_CreateProjectRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.resourcemanager.v3.CreateProjectRequest.class, com.google.cloud.resourcemanager.v3.CreateProjectRequest.Builder.class);
  }

  public static final int PROJECT_FIELD_NUMBER = 1;
  private com.google.cloud.resourcemanager.v3.Project project_;
  /**
   * <pre>
   * Required. The Project to create.
   *
   * Project ID is required. If the requested ID is unavailable, the request
   * fails.
   *
   * If the `parent` field is set, the `resourcemanager.projects.create`
   * permission is checked on the parent resource. If no parent is set and
   * the authorization credentials belong to an Organization, the parent
   * will be set to that Organization.
   * </pre>
   *
   * <code>.google.cloud.resourcemanager.v3.Project project = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the project field is set.
   */
  @java.lang.Override
  public boolean hasProject() {
    return project_ != null;
  }
  /**
   * <pre>
   * Required. The Project to create.
   *
   * Project ID is required. If the requested ID is unavailable, the request
   * fails.
   *
   * If the `parent` field is set, the `resourcemanager.projects.create`
   * permission is checked on the parent resource. If no parent is set and
   * the authorization credentials belong to an Organization, the parent
   * will be set to that Organization.
   * </pre>
   *
   * <code>.google.cloud.resourcemanager.v3.Project project = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The project.
   */
  @java.lang.Override
  public com.google.cloud.resourcemanager.v3.Project getProject() {
    return project_ == null ? com.google.cloud.resourcemanager.v3.Project.getDefaultInstance() : project_;
  }
  /**
   * <pre>
   * Required. The Project to create.
   *
   * Project ID is required. If the requested ID is unavailable, the request
   * fails.
   *
   * If the `parent` field is set, the `resourcemanager.projects.create`
   * permission is checked on the parent resource. If no parent is set and
   * the authorization credentials belong to an Organization, the parent
   * will be set to that Organization.
   * </pre>
   *
   * <code>.google.cloud.resourcemanager.v3.Project project = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  @java.lang.Override
  public com.google.cloud.resourcemanager.v3.ProjectOrBuilder getProjectOrBuilder() {
    return project_ == null ? com.google.cloud.resourcemanager.v3.Project.getDefaultInstance() : project_;
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
    if (project_ != null) {
      output.writeMessage(1, getProject());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (project_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getProject());
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
    if (!(obj instanceof com.google.cloud.resourcemanager.v3.CreateProjectRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.resourcemanager.v3.CreateProjectRequest other = (com.google.cloud.resourcemanager.v3.CreateProjectRequest) obj;

    if (hasProject() != other.hasProject()) return false;
    if (hasProject()) {
      if (!getProject()
          .equals(other.getProject())) return false;
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
    if (hasProject()) {
      hash = (37 * hash) + PROJECT_FIELD_NUMBER;
      hash = (53 * hash) + getProject().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.resourcemanager.v3.CreateProjectRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.resourcemanager.v3.CreateProjectRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.resourcemanager.v3.CreateProjectRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.resourcemanager.v3.CreateProjectRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.resourcemanager.v3.CreateProjectRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.resourcemanager.v3.CreateProjectRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.resourcemanager.v3.CreateProjectRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.resourcemanager.v3.CreateProjectRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.resourcemanager.v3.CreateProjectRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.resourcemanager.v3.CreateProjectRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.resourcemanager.v3.CreateProjectRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.resourcemanager.v3.CreateProjectRequest parseFrom(
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
  public static Builder newBuilder(com.google.cloud.resourcemanager.v3.CreateProjectRequest prototype) {
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
   * The request sent to the
   * [CreateProject][google.cloud.resourcemanager.v3.Projects.CreateProject]
   * method.
   * </pre>
   *
   * Protobuf type {@code google.cloud.resourcemanager.v3.CreateProjectRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.resourcemanager.v3.CreateProjectRequest)
      com.google.cloud.resourcemanager.v3.CreateProjectRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.resourcemanager.v3.ProjectsProto.internal_static_google_cloud_resourcemanager_v3_CreateProjectRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.resourcemanager.v3.ProjectsProto.internal_static_google_cloud_resourcemanager_v3_CreateProjectRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.resourcemanager.v3.CreateProjectRequest.class, com.google.cloud.resourcemanager.v3.CreateProjectRequest.Builder.class);
    }

    // Construct using com.google.cloud.resourcemanager.v3.CreateProjectRequest.newBuilder()
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
      project_ = null;
      if (projectBuilder_ != null) {
        projectBuilder_.dispose();
        projectBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.resourcemanager.v3.ProjectsProto.internal_static_google_cloud_resourcemanager_v3_CreateProjectRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.resourcemanager.v3.CreateProjectRequest getDefaultInstanceForType() {
      return com.google.cloud.resourcemanager.v3.CreateProjectRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.resourcemanager.v3.CreateProjectRequest build() {
      com.google.cloud.resourcemanager.v3.CreateProjectRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.resourcemanager.v3.CreateProjectRequest buildPartial() {
      com.google.cloud.resourcemanager.v3.CreateProjectRequest result = new com.google.cloud.resourcemanager.v3.CreateProjectRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.resourcemanager.v3.CreateProjectRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.project_ = projectBuilder_ == null
            ? project_
            : projectBuilder_.build();
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
      if (other instanceof com.google.cloud.resourcemanager.v3.CreateProjectRequest) {
        return mergeFrom((com.google.cloud.resourcemanager.v3.CreateProjectRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.resourcemanager.v3.CreateProjectRequest other) {
      if (other == com.google.cloud.resourcemanager.v3.CreateProjectRequest.getDefaultInstance()) return this;
      if (other.hasProject()) {
        mergeProject(other.getProject());
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
              input.readMessage(
                  getProjectFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
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

    private com.google.cloud.resourcemanager.v3.Project project_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.resourcemanager.v3.Project, com.google.cloud.resourcemanager.v3.Project.Builder, com.google.cloud.resourcemanager.v3.ProjectOrBuilder> projectBuilder_;
    /**
     * <pre>
     * Required. The Project to create.
     *
     * Project ID is required. If the requested ID is unavailable, the request
     * fails.
     *
     * If the `parent` field is set, the `resourcemanager.projects.create`
     * permission is checked on the parent resource. If no parent is set and
     * the authorization credentials belong to an Organization, the parent
     * will be set to that Organization.
     * </pre>
     *
     * <code>.google.cloud.resourcemanager.v3.Project project = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return Whether the project field is set.
     */
    public boolean hasProject() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * Required. The Project to create.
     *
     * Project ID is required. If the requested ID is unavailable, the request
     * fails.
     *
     * If the `parent` field is set, the `resourcemanager.projects.create`
     * permission is checked on the parent resource. If no parent is set and
     * the authorization credentials belong to an Organization, the parent
     * will be set to that Organization.
     * </pre>
     *
     * <code>.google.cloud.resourcemanager.v3.Project project = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The project.
     */
    public com.google.cloud.resourcemanager.v3.Project getProject() {
      if (projectBuilder_ == null) {
        return project_ == null ? com.google.cloud.resourcemanager.v3.Project.getDefaultInstance() : project_;
      } else {
        return projectBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Required. The Project to create.
     *
     * Project ID is required. If the requested ID is unavailable, the request
     * fails.
     *
     * If the `parent` field is set, the `resourcemanager.projects.create`
     * permission is checked on the parent resource. If no parent is set and
     * the authorization credentials belong to an Organization, the parent
     * will be set to that Organization.
     * </pre>
     *
     * <code>.google.cloud.resourcemanager.v3.Project project = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setProject(com.google.cloud.resourcemanager.v3.Project value) {
      if (projectBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        project_ = value;
      } else {
        projectBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The Project to create.
     *
     * Project ID is required. If the requested ID is unavailable, the request
     * fails.
     *
     * If the `parent` field is set, the `resourcemanager.projects.create`
     * permission is checked on the parent resource. If no parent is set and
     * the authorization credentials belong to an Organization, the parent
     * will be set to that Organization.
     * </pre>
     *
     * <code>.google.cloud.resourcemanager.v3.Project project = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setProject(
        com.google.cloud.resourcemanager.v3.Project.Builder builderForValue) {
      if (projectBuilder_ == null) {
        project_ = builderForValue.build();
      } else {
        projectBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The Project to create.
     *
     * Project ID is required. If the requested ID is unavailable, the request
     * fails.
     *
     * If the `parent` field is set, the `resourcemanager.projects.create`
     * permission is checked on the parent resource. If no parent is set and
     * the authorization credentials belong to an Organization, the parent
     * will be set to that Organization.
     * </pre>
     *
     * <code>.google.cloud.resourcemanager.v3.Project project = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder mergeProject(com.google.cloud.resourcemanager.v3.Project value) {
      if (projectBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          project_ != null &&
          project_ != com.google.cloud.resourcemanager.v3.Project.getDefaultInstance()) {
          getProjectBuilder().mergeFrom(value);
        } else {
          project_ = value;
        }
      } else {
        projectBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The Project to create.
     *
     * Project ID is required. If the requested ID is unavailable, the request
     * fails.
     *
     * If the `parent` field is set, the `resourcemanager.projects.create`
     * permission is checked on the parent resource. If no parent is set and
     * the authorization credentials belong to an Organization, the parent
     * will be set to that Organization.
     * </pre>
     *
     * <code>.google.cloud.resourcemanager.v3.Project project = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder clearProject() {
      bitField0_ = (bitField0_ & ~0x00000001);
      project_ = null;
      if (projectBuilder_ != null) {
        projectBuilder_.dispose();
        projectBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The Project to create.
     *
     * Project ID is required. If the requested ID is unavailable, the request
     * fails.
     *
     * If the `parent` field is set, the `resourcemanager.projects.create`
     * permission is checked on the parent resource. If no parent is set and
     * the authorization credentials belong to an Organization, the parent
     * will be set to that Organization.
     * </pre>
     *
     * <code>.google.cloud.resourcemanager.v3.Project project = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.cloud.resourcemanager.v3.Project.Builder getProjectBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getProjectFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Required. The Project to create.
     *
     * Project ID is required. If the requested ID is unavailable, the request
     * fails.
     *
     * If the `parent` field is set, the `resourcemanager.projects.create`
     * permission is checked on the parent resource. If no parent is set and
     * the authorization credentials belong to an Organization, the parent
     * will be set to that Organization.
     * </pre>
     *
     * <code>.google.cloud.resourcemanager.v3.Project project = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.cloud.resourcemanager.v3.ProjectOrBuilder getProjectOrBuilder() {
      if (projectBuilder_ != null) {
        return projectBuilder_.getMessageOrBuilder();
      } else {
        return project_ == null ?
            com.google.cloud.resourcemanager.v3.Project.getDefaultInstance() : project_;
      }
    }
    /**
     * <pre>
     * Required. The Project to create.
     *
     * Project ID is required. If the requested ID is unavailable, the request
     * fails.
     *
     * If the `parent` field is set, the `resourcemanager.projects.create`
     * permission is checked on the parent resource. If no parent is set and
     * the authorization credentials belong to an Organization, the parent
     * will be set to that Organization.
     * </pre>
     *
     * <code>.google.cloud.resourcemanager.v3.Project project = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.resourcemanager.v3.Project, com.google.cloud.resourcemanager.v3.Project.Builder, com.google.cloud.resourcemanager.v3.ProjectOrBuilder> 
        getProjectFieldBuilder() {
      if (projectBuilder_ == null) {
        projectBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.resourcemanager.v3.Project, com.google.cloud.resourcemanager.v3.Project.Builder, com.google.cloud.resourcemanager.v3.ProjectOrBuilder>(
                getProject(),
                getParentForChildren(),
                isClean());
        project_ = null;
      }
      return projectBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.resourcemanager.v3.CreateProjectRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.resourcemanager.v3.CreateProjectRequest)
  private static final com.google.cloud.resourcemanager.v3.CreateProjectRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.resourcemanager.v3.CreateProjectRequest();
  }

  public static com.google.cloud.resourcemanager.v3.CreateProjectRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateProjectRequest>
      PARSER = new com.google.protobuf.AbstractParser<CreateProjectRequest>() {
    @java.lang.Override
    public CreateProjectRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<CreateProjectRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateProjectRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.resourcemanager.v3.CreateProjectRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

