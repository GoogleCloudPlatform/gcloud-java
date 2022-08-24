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
// source: google/cloud/dialogflow/v2beta1/agent.proto

package com.google.cloud.dialogflow.v2beta1;

/**
 *
 *
 * <pre>
 * Contains basic configuration for a sub-agent.
 * </pre>
 *
 * Protobuf type {@code google.cloud.dialogflow.v2beta1.SubAgent}
 */
public final class SubAgent extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.dialogflow.v2beta1.SubAgent)
    SubAgentOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use SubAgent.newBuilder() to construct.
  private SubAgent(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private SubAgent() {
    project_ = "";
    environment_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new SubAgent();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private SubAgent(
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
          case 10:
            {
              java.lang.String s = input.readStringRequireUtf8();

              project_ = s;
              break;
            }
          case 18:
            {
              java.lang.String s = input.readStringRequireUtf8();

              environment_ = s;
              break;
            }
          default:
            {
              if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.dialogflow.v2beta1.AgentProto
        .internal_static_google_cloud_dialogflow_v2beta1_SubAgent_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.dialogflow.v2beta1.AgentProto
        .internal_static_google_cloud_dialogflow_v2beta1_SubAgent_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.dialogflow.v2beta1.SubAgent.class,
            com.google.cloud.dialogflow.v2beta1.SubAgent.Builder.class);
  }

  public static final int PROJECT_FIELD_NUMBER = 1;
  private volatile java.lang.Object project_;
  /**
   *
   *
   * <pre>
   * Required. The project of this agent.
   * Format: `projects/&lt;Project ID&gt;` or
   *         `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;`.
   * </pre>
   *
   * <code>string project = 1;</code>
   *
   * @return The project.
   */
  @java.lang.Override
  public java.lang.String getProject() {
    java.lang.Object ref = project_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      project_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. The project of this agent.
   * Format: `projects/&lt;Project ID&gt;` or
   *         `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;`.
   * </pre>
   *
   * <code>string project = 1;</code>
   *
   * @return The bytes for project.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getProjectBytes() {
    java.lang.Object ref = project_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      project_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ENVIRONMENT_FIELD_NUMBER = 2;
  private volatile java.lang.Object environment_;
  /**
   *
   *
   * <pre>
   * Optional. The unique identifier (`environment name` in dialogflow console)
   * of this sub-agent environment. Assumes draft environment if `environment`
   * is not set.
   * </pre>
   *
   * <code>string environment = 2;</code>
   *
   * @return The environment.
   */
  @java.lang.Override
  public java.lang.String getEnvironment() {
    java.lang.Object ref = environment_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      environment_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Optional. The unique identifier (`environment name` in dialogflow console)
   * of this sub-agent environment. Assumes draft environment if `environment`
   * is not set.
   * </pre>
   *
   * <code>string environment = 2;</code>
   *
   * @return The bytes for environment.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getEnvironmentBytes() {
    java.lang.Object ref = environment_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      environment_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(project_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, project_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(environment_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, environment_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(project_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, project_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(environment_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, environment_);
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
    if (!(obj instanceof com.google.cloud.dialogflow.v2beta1.SubAgent)) {
      return super.equals(obj);
    }
    com.google.cloud.dialogflow.v2beta1.SubAgent other =
        (com.google.cloud.dialogflow.v2beta1.SubAgent) obj;

    if (!getProject().equals(other.getProject())) return false;
    if (!getEnvironment().equals(other.getEnvironment())) return false;
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
    hash = (37 * hash) + PROJECT_FIELD_NUMBER;
    hash = (53 * hash) + getProject().hashCode();
    hash = (37 * hash) + ENVIRONMENT_FIELD_NUMBER;
    hash = (53 * hash) + getEnvironment().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.dialogflow.v2beta1.SubAgent parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dialogflow.v2beta1.SubAgent parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.v2beta1.SubAgent parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dialogflow.v2beta1.SubAgent parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.v2beta1.SubAgent parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dialogflow.v2beta1.SubAgent parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.v2beta1.SubAgent parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.dialogflow.v2beta1.SubAgent parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.v2beta1.SubAgent parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.dialogflow.v2beta1.SubAgent parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.v2beta1.SubAgent parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.dialogflow.v2beta1.SubAgent parseFrom(
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

  public static Builder newBuilder(com.google.cloud.dialogflow.v2beta1.SubAgent prototype) {
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
   * Contains basic configuration for a sub-agent.
   * </pre>
   *
   * Protobuf type {@code google.cloud.dialogflow.v2beta1.SubAgent}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.dialogflow.v2beta1.SubAgent)
      com.google.cloud.dialogflow.v2beta1.SubAgentOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.dialogflow.v2beta1.AgentProto
          .internal_static_google_cloud_dialogflow_v2beta1_SubAgent_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.dialogflow.v2beta1.AgentProto
          .internal_static_google_cloud_dialogflow_v2beta1_SubAgent_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.dialogflow.v2beta1.SubAgent.class,
              com.google.cloud.dialogflow.v2beta1.SubAgent.Builder.class);
    }

    // Construct using com.google.cloud.dialogflow.v2beta1.SubAgent.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      project_ = "";

      environment_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.dialogflow.v2beta1.AgentProto
          .internal_static_google_cloud_dialogflow_v2beta1_SubAgent_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.v2beta1.SubAgent getDefaultInstanceForType() {
      return com.google.cloud.dialogflow.v2beta1.SubAgent.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.v2beta1.SubAgent build() {
      com.google.cloud.dialogflow.v2beta1.SubAgent result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.v2beta1.SubAgent buildPartial() {
      com.google.cloud.dialogflow.v2beta1.SubAgent result =
          new com.google.cloud.dialogflow.v2beta1.SubAgent(this);
      result.project_ = project_;
      result.environment_ = environment_;
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
      if (other instanceof com.google.cloud.dialogflow.v2beta1.SubAgent) {
        return mergeFrom((com.google.cloud.dialogflow.v2beta1.SubAgent) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.dialogflow.v2beta1.SubAgent other) {
      if (other == com.google.cloud.dialogflow.v2beta1.SubAgent.getDefaultInstance()) return this;
      if (!other.getProject().isEmpty()) {
        project_ = other.project_;
        onChanged();
      }
      if (!other.getEnvironment().isEmpty()) {
        environment_ = other.environment_;
        onChanged();
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
      com.google.cloud.dialogflow.v2beta1.SubAgent parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.dialogflow.v2beta1.SubAgent) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object project_ = "";
    /**
     *
     *
     * <pre>
     * Required. The project of this agent.
     * Format: `projects/&lt;Project ID&gt;` or
     *         `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;`.
     * </pre>
     *
     * <code>string project = 1;</code>
     *
     * @return The project.
     */
    public java.lang.String getProject() {
      java.lang.Object ref = project_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        project_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The project of this agent.
     * Format: `projects/&lt;Project ID&gt;` or
     *         `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;`.
     * </pre>
     *
     * <code>string project = 1;</code>
     *
     * @return The bytes for project.
     */
    public com.google.protobuf.ByteString getProjectBytes() {
      java.lang.Object ref = project_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        project_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The project of this agent.
     * Format: `projects/&lt;Project ID&gt;` or
     *         `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;`.
     * </pre>
     *
     * <code>string project = 1;</code>
     *
     * @param value The project to set.
     * @return This builder for chaining.
     */
    public Builder setProject(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      project_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The project of this agent.
     * Format: `projects/&lt;Project ID&gt;` or
     *         `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;`.
     * </pre>
     *
     * <code>string project = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearProject() {

      project_ = getDefaultInstance().getProject();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The project of this agent.
     * Format: `projects/&lt;Project ID&gt;` or
     *         `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;`.
     * </pre>
     *
     * <code>string project = 1;</code>
     *
     * @param value The bytes for project to set.
     * @return This builder for chaining.
     */
    public Builder setProjectBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      project_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object environment_ = "";
    /**
     *
     *
     * <pre>
     * Optional. The unique identifier (`environment name` in dialogflow console)
     * of this sub-agent environment. Assumes draft environment if `environment`
     * is not set.
     * </pre>
     *
     * <code>string environment = 2;</code>
     *
     * @return The environment.
     */
    public java.lang.String getEnvironment() {
      java.lang.Object ref = environment_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        environment_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Optional. The unique identifier (`environment name` in dialogflow console)
     * of this sub-agent environment. Assumes draft environment if `environment`
     * is not set.
     * </pre>
     *
     * <code>string environment = 2;</code>
     *
     * @return The bytes for environment.
     */
    public com.google.protobuf.ByteString getEnvironmentBytes() {
      java.lang.Object ref = environment_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        environment_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Optional. The unique identifier (`environment name` in dialogflow console)
     * of this sub-agent environment. Assumes draft environment if `environment`
     * is not set.
     * </pre>
     *
     * <code>string environment = 2;</code>
     *
     * @param value The environment to set.
     * @return This builder for chaining.
     */
    public Builder setEnvironment(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      environment_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. The unique identifier (`environment name` in dialogflow console)
     * of this sub-agent environment. Assumes draft environment if `environment`
     * is not set.
     * </pre>
     *
     * <code>string environment = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearEnvironment() {

      environment_ = getDefaultInstance().getEnvironment();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. The unique identifier (`environment name` in dialogflow console)
     * of this sub-agent environment. Assumes draft environment if `environment`
     * is not set.
     * </pre>
     *
     * <code>string environment = 2;</code>
     *
     * @param value The bytes for environment to set.
     * @return This builder for chaining.
     */
    public Builder setEnvironmentBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      environment_ = value;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.dialogflow.v2beta1.SubAgent)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.dialogflow.v2beta1.SubAgent)
  private static final com.google.cloud.dialogflow.v2beta1.SubAgent DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.dialogflow.v2beta1.SubAgent();
  }

  public static com.google.cloud.dialogflow.v2beta1.SubAgent getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SubAgent> PARSER =
      new com.google.protobuf.AbstractParser<SubAgent>() {
        @java.lang.Override
        public SubAgent parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new SubAgent(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<SubAgent> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SubAgent> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.dialogflow.v2beta1.SubAgent getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
