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
// source: google/devtools/cloudbuild/v2/repositories.proto

package google.devtools.cloudbuild.v2;

/**
 *
 *
 * <pre>
 * Describes stage and necessary actions to be taken by the
 * user to complete the installation. Used for GitHub and GitHub Enterprise
 * based connections.
 * </pre>
 *
 * Protobuf type {@code google.devtools.cloudbuild.v2.InstallationState}
 */
public final class InstallationState extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.devtools.cloudbuild.v2.InstallationState)
    InstallationStateOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use InstallationState.newBuilder() to construct.
  private InstallationState(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private InstallationState() {
    stage_ = 0;
    message_ = "";
    actionUri_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new InstallationState();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return google.devtools.cloudbuild.v2.RepositoryManagerProto
        .internal_static_google_devtools_cloudbuild_v2_InstallationState_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return google.devtools.cloudbuild.v2.RepositoryManagerProto
        .internal_static_google_devtools_cloudbuild_v2_InstallationState_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            google.devtools.cloudbuild.v2.InstallationState.class,
            google.devtools.cloudbuild.v2.InstallationState.Builder.class);
  }

  /**
   *
   *
   * <pre>
   * Stage of the installation process.
   * </pre>
   *
   * Protobuf enum {@code google.devtools.cloudbuild.v2.InstallationState.Stage}
   */
  public enum Stage implements com.google.protobuf.ProtocolMessageEnum {
    /**
     *
     *
     * <pre>
     * No stage specified.
     * </pre>
     *
     * <code>STAGE_UNSPECIFIED = 0;</code>
     */
    STAGE_UNSPECIFIED(0),
    /**
     *
     *
     * <pre>
     * Only for GitHub Enterprise. An App creation has been requested.
     * The user needs to confirm the creation in their GitHub enterprise host.
     * </pre>
     *
     * <code>PENDING_CREATE_APP = 1;</code>
     */
    PENDING_CREATE_APP(1),
    /**
     *
     *
     * <pre>
     * User needs to authorize the GitHub (or Enterprise) App via OAuth.
     * </pre>
     *
     * <code>PENDING_USER_OAUTH = 2;</code>
     */
    PENDING_USER_OAUTH(2),
    /**
     *
     *
     * <pre>
     * User needs to follow the link to install the GitHub (or Enterprise) App.
     * </pre>
     *
     * <code>PENDING_INSTALL_APP = 3;</code>
     */
    PENDING_INSTALL_APP(3),
    /**
     *
     *
     * <pre>
     * Installation process has been completed.
     * </pre>
     *
     * <code>COMPLETE = 10;</code>
     */
    COMPLETE(10),
    UNRECOGNIZED(-1),
    ;

    /**
     *
     *
     * <pre>
     * No stage specified.
     * </pre>
     *
     * <code>STAGE_UNSPECIFIED = 0;</code>
     */
    public static final int STAGE_UNSPECIFIED_VALUE = 0;
    /**
     *
     *
     * <pre>
     * Only for GitHub Enterprise. An App creation has been requested.
     * The user needs to confirm the creation in their GitHub enterprise host.
     * </pre>
     *
     * <code>PENDING_CREATE_APP = 1;</code>
     */
    public static final int PENDING_CREATE_APP_VALUE = 1;
    /**
     *
     *
     * <pre>
     * User needs to authorize the GitHub (or Enterprise) App via OAuth.
     * </pre>
     *
     * <code>PENDING_USER_OAUTH = 2;</code>
     */
    public static final int PENDING_USER_OAUTH_VALUE = 2;
    /**
     *
     *
     * <pre>
     * User needs to follow the link to install the GitHub (or Enterprise) App.
     * </pre>
     *
     * <code>PENDING_INSTALL_APP = 3;</code>
     */
    public static final int PENDING_INSTALL_APP_VALUE = 3;
    /**
     *
     *
     * <pre>
     * Installation process has been completed.
     * </pre>
     *
     * <code>COMPLETE = 10;</code>
     */
    public static final int COMPLETE_VALUE = 10;

    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static Stage valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static Stage forNumber(int value) {
      switch (value) {
        case 0:
          return STAGE_UNSPECIFIED;
        case 1:
          return PENDING_CREATE_APP;
        case 2:
          return PENDING_USER_OAUTH;
        case 3:
          return PENDING_INSTALL_APP;
        case 10:
          return COMPLETE;
        default:
          return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<Stage> internalGetValueMap() {
      return internalValueMap;
    }

    private static final com.google.protobuf.Internal.EnumLiteMap<Stage> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<Stage>() {
          public Stage findValueByNumber(int number) {
            return Stage.forNumber(number);
          }
        };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }

    public final com.google.protobuf.Descriptors.EnumDescriptor getDescriptorForType() {
      return getDescriptor();
    }

    public static final com.google.protobuf.Descriptors.EnumDescriptor getDescriptor() {
      return google.devtools.cloudbuild.v2.InstallationState.getDescriptor().getEnumTypes().get(0);
    }

    private static final Stage[] VALUES = values();

    public static Stage valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private Stage(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.devtools.cloudbuild.v2.InstallationState.Stage)
  }

  public static final int STAGE_FIELD_NUMBER = 1;
  private int stage_ = 0;
  /**
   *
   *
   * <pre>
   * Output only. Current step of the installation process.
   * </pre>
   *
   * <code>
   * .google.devtools.cloudbuild.v2.InstallationState.Stage stage = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The enum numeric value on the wire for stage.
   */
  @java.lang.Override
  public int getStageValue() {
    return stage_;
  }
  /**
   *
   *
   * <pre>
   * Output only. Current step of the installation process.
   * </pre>
   *
   * <code>
   * .google.devtools.cloudbuild.v2.InstallationState.Stage stage = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The stage.
   */
  @java.lang.Override
  public google.devtools.cloudbuild.v2.InstallationState.Stage getStage() {
    google.devtools.cloudbuild.v2.InstallationState.Stage result =
        google.devtools.cloudbuild.v2.InstallationState.Stage.forNumber(stage_);
    return result == null
        ? google.devtools.cloudbuild.v2.InstallationState.Stage.UNRECOGNIZED
        : result;
  }

  public static final int MESSAGE_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object message_ = "";
  /**
   *
   *
   * <pre>
   * Output only. Message of what the user should do next to continue the
   * installation. Empty string if the installation is already complete.
   * </pre>
   *
   * <code>string message = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The message.
   */
  @java.lang.Override
  public java.lang.String getMessage() {
    java.lang.Object ref = message_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      message_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Output only. Message of what the user should do next to continue the
   * installation. Empty string if the installation is already complete.
   * </pre>
   *
   * <code>string message = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for message.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getMessageBytes() {
    java.lang.Object ref = message_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      message_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ACTION_URI_FIELD_NUMBER = 3;

  @SuppressWarnings("serial")
  private volatile java.lang.Object actionUri_ = "";
  /**
   *
   *
   * <pre>
   * Output only. Link to follow for next action. Empty string if the
   * installation is already complete.
   * </pre>
   *
   * <code>string action_uri = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The actionUri.
   */
  @java.lang.Override
  public java.lang.String getActionUri() {
    java.lang.Object ref = actionUri_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      actionUri_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Output only. Link to follow for next action. Empty string if the
   * installation is already complete.
   * </pre>
   *
   * <code>string action_uri = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for actionUri.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getActionUriBytes() {
    java.lang.Object ref = actionUri_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      actionUri_ = b;
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
    if (stage_
        != google.devtools.cloudbuild.v2.InstallationState.Stage.STAGE_UNSPECIFIED.getNumber()) {
      output.writeEnum(1, stage_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(message_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, message_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(actionUri_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, actionUri_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (stage_
        != google.devtools.cloudbuild.v2.InstallationState.Stage.STAGE_UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(1, stage_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(message_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, message_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(actionUri_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, actionUri_);
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
    if (!(obj instanceof google.devtools.cloudbuild.v2.InstallationState)) {
      return super.equals(obj);
    }
    google.devtools.cloudbuild.v2.InstallationState other =
        (google.devtools.cloudbuild.v2.InstallationState) obj;

    if (stage_ != other.stage_) return false;
    if (!getMessage().equals(other.getMessage())) return false;
    if (!getActionUri().equals(other.getActionUri())) return false;
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
    hash = (37 * hash) + STAGE_FIELD_NUMBER;
    hash = (53 * hash) + stage_;
    hash = (37 * hash) + MESSAGE_FIELD_NUMBER;
    hash = (53 * hash) + getMessage().hashCode();
    hash = (37 * hash) + ACTION_URI_FIELD_NUMBER;
    hash = (53 * hash) + getActionUri().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static google.devtools.cloudbuild.v2.InstallationState parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static google.devtools.cloudbuild.v2.InstallationState parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static google.devtools.cloudbuild.v2.InstallationState parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static google.devtools.cloudbuild.v2.InstallationState parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static google.devtools.cloudbuild.v2.InstallationState parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static google.devtools.cloudbuild.v2.InstallationState parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static google.devtools.cloudbuild.v2.InstallationState parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static google.devtools.cloudbuild.v2.InstallationState parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static google.devtools.cloudbuild.v2.InstallationState parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static google.devtools.cloudbuild.v2.InstallationState parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static google.devtools.cloudbuild.v2.InstallationState parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static google.devtools.cloudbuild.v2.InstallationState parseFrom(
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

  public static Builder newBuilder(google.devtools.cloudbuild.v2.InstallationState prototype) {
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
   * Describes stage and necessary actions to be taken by the
   * user to complete the installation. Used for GitHub and GitHub Enterprise
   * based connections.
   * </pre>
   *
   * Protobuf type {@code google.devtools.cloudbuild.v2.InstallationState}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.devtools.cloudbuild.v2.InstallationState)
      google.devtools.cloudbuild.v2.InstallationStateOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return google.devtools.cloudbuild.v2.RepositoryManagerProto
          .internal_static_google_devtools_cloudbuild_v2_InstallationState_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return google.devtools.cloudbuild.v2.RepositoryManagerProto
          .internal_static_google_devtools_cloudbuild_v2_InstallationState_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              google.devtools.cloudbuild.v2.InstallationState.class,
              google.devtools.cloudbuild.v2.InstallationState.Builder.class);
    }

    // Construct using google.devtools.cloudbuild.v2.InstallationState.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      stage_ = 0;
      message_ = "";
      actionUri_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return google.devtools.cloudbuild.v2.RepositoryManagerProto
          .internal_static_google_devtools_cloudbuild_v2_InstallationState_descriptor;
    }

    @java.lang.Override
    public google.devtools.cloudbuild.v2.InstallationState getDefaultInstanceForType() {
      return google.devtools.cloudbuild.v2.InstallationState.getDefaultInstance();
    }

    @java.lang.Override
    public google.devtools.cloudbuild.v2.InstallationState build() {
      google.devtools.cloudbuild.v2.InstallationState result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public google.devtools.cloudbuild.v2.InstallationState buildPartial() {
      google.devtools.cloudbuild.v2.InstallationState result =
          new google.devtools.cloudbuild.v2.InstallationState(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(google.devtools.cloudbuild.v2.InstallationState result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.stage_ = stage_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.message_ = message_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.actionUri_ = actionUri_;
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
      if (other instanceof google.devtools.cloudbuild.v2.InstallationState) {
        return mergeFrom((google.devtools.cloudbuild.v2.InstallationState) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(google.devtools.cloudbuild.v2.InstallationState other) {
      if (other == google.devtools.cloudbuild.v2.InstallationState.getDefaultInstance())
        return this;
      if (other.stage_ != 0) {
        setStageValue(other.getStageValue());
      }
      if (!other.getMessage().isEmpty()) {
        message_ = other.message_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (!other.getActionUri().isEmpty()) {
        actionUri_ = other.actionUri_;
        bitField0_ |= 0x00000004;
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
            case 8:
              {
                stage_ = input.readEnum();
                bitField0_ |= 0x00000001;
                break;
              } // case 8
            case 18:
              {
                message_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000002;
                break;
              } // case 18
            case 26:
              {
                actionUri_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000004;
                break;
              } // case 26
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

    private int stage_ = 0;
    /**
     *
     *
     * <pre>
     * Output only. Current step of the installation process.
     * </pre>
     *
     * <code>
     * .google.devtools.cloudbuild.v2.InstallationState.Stage stage = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     *
     * @return The enum numeric value on the wire for stage.
     */
    @java.lang.Override
    public int getStageValue() {
      return stage_;
    }
    /**
     *
     *
     * <pre>
     * Output only. Current step of the installation process.
     * </pre>
     *
     * <code>
     * .google.devtools.cloudbuild.v2.InstallationState.Stage stage = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     *
     * @param value The enum numeric value on the wire for stage to set.
     * @return This builder for chaining.
     */
    public Builder setStageValue(int value) {
      stage_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. Current step of the installation process.
     * </pre>
     *
     * <code>
     * .google.devtools.cloudbuild.v2.InstallationState.Stage stage = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     *
     * @return The stage.
     */
    @java.lang.Override
    public google.devtools.cloudbuild.v2.InstallationState.Stage getStage() {
      google.devtools.cloudbuild.v2.InstallationState.Stage result =
          google.devtools.cloudbuild.v2.InstallationState.Stage.forNumber(stage_);
      return result == null
          ? google.devtools.cloudbuild.v2.InstallationState.Stage.UNRECOGNIZED
          : result;
    }
    /**
     *
     *
     * <pre>
     * Output only. Current step of the installation process.
     * </pre>
     *
     * <code>
     * .google.devtools.cloudbuild.v2.InstallationState.Stage stage = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     *
     * @param value The stage to set.
     * @return This builder for chaining.
     */
    public Builder setStage(google.devtools.cloudbuild.v2.InstallationState.Stage value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000001;
      stage_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. Current step of the installation process.
     * </pre>
     *
     * <code>
     * .google.devtools.cloudbuild.v2.InstallationState.Stage stage = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearStage() {
      bitField0_ = (bitField0_ & ~0x00000001);
      stage_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object message_ = "";
    /**
     *
     *
     * <pre>
     * Output only. Message of what the user should do next to continue the
     * installation. Empty string if the installation is already complete.
     * </pre>
     *
     * <code>string message = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @return The message.
     */
    public java.lang.String getMessage() {
      java.lang.Object ref = message_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        message_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Output only. Message of what the user should do next to continue the
     * installation. Empty string if the installation is already complete.
     * </pre>
     *
     * <code>string message = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @return The bytes for message.
     */
    public com.google.protobuf.ByteString getMessageBytes() {
      java.lang.Object ref = message_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        message_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Output only. Message of what the user should do next to continue the
     * installation. Empty string if the installation is already complete.
     * </pre>
     *
     * <code>string message = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @param value The message to set.
     * @return This builder for chaining.
     */
    public Builder setMessage(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      message_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. Message of what the user should do next to continue the
     * installation. Empty string if the installation is already complete.
     * </pre>
     *
     * <code>string message = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearMessage() {
      message_ = getDefaultInstance().getMessage();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. Message of what the user should do next to continue the
     * installation. Empty string if the installation is already complete.
     * </pre>
     *
     * <code>string message = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @param value The bytes for message to set.
     * @return This builder for chaining.
     */
    public Builder setMessageBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      message_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private java.lang.Object actionUri_ = "";
    /**
     *
     *
     * <pre>
     * Output only. Link to follow for next action. Empty string if the
     * installation is already complete.
     * </pre>
     *
     * <code>string action_uri = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @return The actionUri.
     */
    public java.lang.String getActionUri() {
      java.lang.Object ref = actionUri_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        actionUri_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Output only. Link to follow for next action. Empty string if the
     * installation is already complete.
     * </pre>
     *
     * <code>string action_uri = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @return The bytes for actionUri.
     */
    public com.google.protobuf.ByteString getActionUriBytes() {
      java.lang.Object ref = actionUri_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        actionUri_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Output only. Link to follow for next action. Empty string if the
     * installation is already complete.
     * </pre>
     *
     * <code>string action_uri = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @param value The actionUri to set.
     * @return This builder for chaining.
     */
    public Builder setActionUri(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      actionUri_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. Link to follow for next action. Empty string if the
     * installation is already complete.
     * </pre>
     *
     * <code>string action_uri = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearActionUri() {
      actionUri_ = getDefaultInstance().getActionUri();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. Link to follow for next action. Empty string if the
     * installation is already complete.
     * </pre>
     *
     * <code>string action_uri = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @param value The bytes for actionUri to set.
     * @return This builder for chaining.
     */
    public Builder setActionUriBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      actionUri_ = value;
      bitField0_ |= 0x00000004;
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

    // @@protoc_insertion_point(builder_scope:google.devtools.cloudbuild.v2.InstallationState)
  }

  // @@protoc_insertion_point(class_scope:google.devtools.cloudbuild.v2.InstallationState)
  private static final google.devtools.cloudbuild.v2.InstallationState DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new google.devtools.cloudbuild.v2.InstallationState();
  }

  public static google.devtools.cloudbuild.v2.InstallationState getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<InstallationState> PARSER =
      new com.google.protobuf.AbstractParser<InstallationState>() {
        @java.lang.Override
        public InstallationState parsePartialFrom(
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

  public static com.google.protobuf.Parser<InstallationState> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<InstallationState> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public google.devtools.cloudbuild.v2.InstallationState getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
