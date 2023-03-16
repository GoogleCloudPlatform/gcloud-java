// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dialogflow/v2/conversation_profile.proto

package com.google.cloud.dialogflow.v2;

/**
 * <pre>
 * The request message for
 * [ConversationProfiles.SetSuggestionFeature][].
 * </pre>
 *
 * Protobuf type {@code google.cloud.dialogflow.v2.SetSuggestionFeatureConfigRequest}
 */
public final class SetSuggestionFeatureConfigRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.dialogflow.v2.SetSuggestionFeatureConfigRequest)
    SetSuggestionFeatureConfigRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SetSuggestionFeatureConfigRequest.newBuilder() to construct.
  private SetSuggestionFeatureConfigRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SetSuggestionFeatureConfigRequest() {
    conversationProfile_ = "";
    participantRole_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SetSuggestionFeatureConfigRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.dialogflow.v2.ConversationProfileProto.internal_static_google_cloud_dialogflow_v2_SetSuggestionFeatureConfigRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.dialogflow.v2.ConversationProfileProto.internal_static_google_cloud_dialogflow_v2_SetSuggestionFeatureConfigRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.dialogflow.v2.SetSuggestionFeatureConfigRequest.class, com.google.cloud.dialogflow.v2.SetSuggestionFeatureConfigRequest.Builder.class);
  }

  public static final int CONVERSATION_PROFILE_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object conversationProfile_ = "";
  /**
   * <pre>
   * Required. The Conversation Profile to add or update the suggestion feature
   * config. Format: `projects/&lt;Project ID&gt;/locations/&lt;Location
   * ID&gt;/conversationProfiles/&lt;Conversation Profile ID&gt;`.
   * </pre>
   *
   * <code>string conversation_profile = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The conversationProfile.
   */
  @java.lang.Override
  public java.lang.String getConversationProfile() {
    java.lang.Object ref = conversationProfile_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      conversationProfile_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Required. The Conversation Profile to add or update the suggestion feature
   * config. Format: `projects/&lt;Project ID&gt;/locations/&lt;Location
   * ID&gt;/conversationProfiles/&lt;Conversation Profile ID&gt;`.
   * </pre>
   *
   * <code>string conversation_profile = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for conversationProfile.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getConversationProfileBytes() {
    java.lang.Object ref = conversationProfile_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      conversationProfile_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PARTICIPANT_ROLE_FIELD_NUMBER = 2;
  private int participantRole_ = 0;
  /**
   * <pre>
   * Required. The participant role to add or update the suggestion feature
   * config. Only HUMAN_AGENT or END_USER can be used.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2.Participant.Role participant_role = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The enum numeric value on the wire for participantRole.
   */
  @java.lang.Override public int getParticipantRoleValue() {
    return participantRole_;
  }
  /**
   * <pre>
   * Required. The participant role to add or update the suggestion feature
   * config. Only HUMAN_AGENT or END_USER can be used.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2.Participant.Role participant_role = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The participantRole.
   */
  @java.lang.Override public com.google.cloud.dialogflow.v2.Participant.Role getParticipantRole() {
    com.google.cloud.dialogflow.v2.Participant.Role result = com.google.cloud.dialogflow.v2.Participant.Role.forNumber(participantRole_);
    return result == null ? com.google.cloud.dialogflow.v2.Participant.Role.UNRECOGNIZED : result;
  }

  public static final int SUGGESTION_FEATURE_CONFIG_FIELD_NUMBER = 3;
  private com.google.cloud.dialogflow.v2.HumanAgentAssistantConfig.SuggestionFeatureConfig suggestionFeatureConfig_;
  /**
   * <pre>
   * Required. The suggestion feature config to add or update.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2.HumanAgentAssistantConfig.SuggestionFeatureConfig suggestion_feature_config = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the suggestionFeatureConfig field is set.
   */
  @java.lang.Override
  public boolean hasSuggestionFeatureConfig() {
    return suggestionFeatureConfig_ != null;
  }
  /**
   * <pre>
   * Required. The suggestion feature config to add or update.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2.HumanAgentAssistantConfig.SuggestionFeatureConfig suggestion_feature_config = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The suggestionFeatureConfig.
   */
  @java.lang.Override
  public com.google.cloud.dialogflow.v2.HumanAgentAssistantConfig.SuggestionFeatureConfig getSuggestionFeatureConfig() {
    return suggestionFeatureConfig_ == null ? com.google.cloud.dialogflow.v2.HumanAgentAssistantConfig.SuggestionFeatureConfig.getDefaultInstance() : suggestionFeatureConfig_;
  }
  /**
   * <pre>
   * Required. The suggestion feature config to add or update.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2.HumanAgentAssistantConfig.SuggestionFeatureConfig suggestion_feature_config = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  @java.lang.Override
  public com.google.cloud.dialogflow.v2.HumanAgentAssistantConfig.SuggestionFeatureConfigOrBuilder getSuggestionFeatureConfigOrBuilder() {
    return suggestionFeatureConfig_ == null ? com.google.cloud.dialogflow.v2.HumanAgentAssistantConfig.SuggestionFeatureConfig.getDefaultInstance() : suggestionFeatureConfig_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(conversationProfile_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, conversationProfile_);
    }
    if (participantRole_ != com.google.cloud.dialogflow.v2.Participant.Role.ROLE_UNSPECIFIED.getNumber()) {
      output.writeEnum(2, participantRole_);
    }
    if (suggestionFeatureConfig_ != null) {
      output.writeMessage(3, getSuggestionFeatureConfig());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(conversationProfile_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, conversationProfile_);
    }
    if (participantRole_ != com.google.cloud.dialogflow.v2.Participant.Role.ROLE_UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, participantRole_);
    }
    if (suggestionFeatureConfig_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getSuggestionFeatureConfig());
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
    if (!(obj instanceof com.google.cloud.dialogflow.v2.SetSuggestionFeatureConfigRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.dialogflow.v2.SetSuggestionFeatureConfigRequest other = (com.google.cloud.dialogflow.v2.SetSuggestionFeatureConfigRequest) obj;

    if (!getConversationProfile()
        .equals(other.getConversationProfile())) return false;
    if (participantRole_ != other.participantRole_) return false;
    if (hasSuggestionFeatureConfig() != other.hasSuggestionFeatureConfig()) return false;
    if (hasSuggestionFeatureConfig()) {
      if (!getSuggestionFeatureConfig()
          .equals(other.getSuggestionFeatureConfig())) return false;
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
    hash = (37 * hash) + CONVERSATION_PROFILE_FIELD_NUMBER;
    hash = (53 * hash) + getConversationProfile().hashCode();
    hash = (37 * hash) + PARTICIPANT_ROLE_FIELD_NUMBER;
    hash = (53 * hash) + participantRole_;
    if (hasSuggestionFeatureConfig()) {
      hash = (37 * hash) + SUGGESTION_FEATURE_CONFIG_FIELD_NUMBER;
      hash = (53 * hash) + getSuggestionFeatureConfig().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.dialogflow.v2.SetSuggestionFeatureConfigRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.dialogflow.v2.SetSuggestionFeatureConfigRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.dialogflow.v2.SetSuggestionFeatureConfigRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.dialogflow.v2.SetSuggestionFeatureConfigRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.dialogflow.v2.SetSuggestionFeatureConfigRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.dialogflow.v2.SetSuggestionFeatureConfigRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.dialogflow.v2.SetSuggestionFeatureConfigRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.dialogflow.v2.SetSuggestionFeatureConfigRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.dialogflow.v2.SetSuggestionFeatureConfigRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.dialogflow.v2.SetSuggestionFeatureConfigRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.dialogflow.v2.SetSuggestionFeatureConfigRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.dialogflow.v2.SetSuggestionFeatureConfigRequest parseFrom(
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
  public static Builder newBuilder(com.google.cloud.dialogflow.v2.SetSuggestionFeatureConfigRequest prototype) {
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
   * The request message for
   * [ConversationProfiles.SetSuggestionFeature][].
   * </pre>
   *
   * Protobuf type {@code google.cloud.dialogflow.v2.SetSuggestionFeatureConfigRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.dialogflow.v2.SetSuggestionFeatureConfigRequest)
      com.google.cloud.dialogflow.v2.SetSuggestionFeatureConfigRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.dialogflow.v2.ConversationProfileProto.internal_static_google_cloud_dialogflow_v2_SetSuggestionFeatureConfigRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.dialogflow.v2.ConversationProfileProto.internal_static_google_cloud_dialogflow_v2_SetSuggestionFeatureConfigRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.dialogflow.v2.SetSuggestionFeatureConfigRequest.class, com.google.cloud.dialogflow.v2.SetSuggestionFeatureConfigRequest.Builder.class);
    }

    // Construct using com.google.cloud.dialogflow.v2.SetSuggestionFeatureConfigRequest.newBuilder()
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
      conversationProfile_ = "";
      participantRole_ = 0;
      suggestionFeatureConfig_ = null;
      if (suggestionFeatureConfigBuilder_ != null) {
        suggestionFeatureConfigBuilder_.dispose();
        suggestionFeatureConfigBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.dialogflow.v2.ConversationProfileProto.internal_static_google_cloud_dialogflow_v2_SetSuggestionFeatureConfigRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.v2.SetSuggestionFeatureConfigRequest getDefaultInstanceForType() {
      return com.google.cloud.dialogflow.v2.SetSuggestionFeatureConfigRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.v2.SetSuggestionFeatureConfigRequest build() {
      com.google.cloud.dialogflow.v2.SetSuggestionFeatureConfigRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.v2.SetSuggestionFeatureConfigRequest buildPartial() {
      com.google.cloud.dialogflow.v2.SetSuggestionFeatureConfigRequest result = new com.google.cloud.dialogflow.v2.SetSuggestionFeatureConfigRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.dialogflow.v2.SetSuggestionFeatureConfigRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.conversationProfile_ = conversationProfile_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.participantRole_ = participantRole_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.suggestionFeatureConfig_ = suggestionFeatureConfigBuilder_ == null
            ? suggestionFeatureConfig_
            : suggestionFeatureConfigBuilder_.build();
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
      if (other instanceof com.google.cloud.dialogflow.v2.SetSuggestionFeatureConfigRequest) {
        return mergeFrom((com.google.cloud.dialogflow.v2.SetSuggestionFeatureConfigRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.dialogflow.v2.SetSuggestionFeatureConfigRequest other) {
      if (other == com.google.cloud.dialogflow.v2.SetSuggestionFeatureConfigRequest.getDefaultInstance()) return this;
      if (!other.getConversationProfile().isEmpty()) {
        conversationProfile_ = other.conversationProfile_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.participantRole_ != 0) {
        setParticipantRoleValue(other.getParticipantRoleValue());
      }
      if (other.hasSuggestionFeatureConfig()) {
        mergeSuggestionFeatureConfig(other.getSuggestionFeatureConfig());
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
              conversationProfile_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 16: {
              participantRole_ = input.readEnum();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 26: {
              input.readMessage(
                  getSuggestionFeatureConfigFieldBuilder().getBuilder(),
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

    private java.lang.Object conversationProfile_ = "";
    /**
     * <pre>
     * Required. The Conversation Profile to add or update the suggestion feature
     * config. Format: `projects/&lt;Project ID&gt;/locations/&lt;Location
     * ID&gt;/conversationProfiles/&lt;Conversation Profile ID&gt;`.
     * </pre>
     *
     * <code>string conversation_profile = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The conversationProfile.
     */
    public java.lang.String getConversationProfile() {
      java.lang.Object ref = conversationProfile_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        conversationProfile_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Required. The Conversation Profile to add or update the suggestion feature
     * config. Format: `projects/&lt;Project ID&gt;/locations/&lt;Location
     * ID&gt;/conversationProfiles/&lt;Conversation Profile ID&gt;`.
     * </pre>
     *
     * <code>string conversation_profile = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The bytes for conversationProfile.
     */
    public com.google.protobuf.ByteString
        getConversationProfileBytes() {
      java.lang.Object ref = conversationProfile_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        conversationProfile_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Required. The Conversation Profile to add or update the suggestion feature
     * config. Format: `projects/&lt;Project ID&gt;/locations/&lt;Location
     * ID&gt;/conversationProfiles/&lt;Conversation Profile ID&gt;`.
     * </pre>
     *
     * <code>string conversation_profile = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The conversationProfile to set.
     * @return This builder for chaining.
     */
    public Builder setConversationProfile(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      conversationProfile_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The Conversation Profile to add or update the suggestion feature
     * config. Format: `projects/&lt;Project ID&gt;/locations/&lt;Location
     * ID&gt;/conversationProfiles/&lt;Conversation Profile ID&gt;`.
     * </pre>
     *
     * <code>string conversation_profile = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return This builder for chaining.
     */
    public Builder clearConversationProfile() {
      conversationProfile_ = getDefaultInstance().getConversationProfile();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The Conversation Profile to add or update the suggestion feature
     * config. Format: `projects/&lt;Project ID&gt;/locations/&lt;Location
     * ID&gt;/conversationProfiles/&lt;Conversation Profile ID&gt;`.
     * </pre>
     *
     * <code>string conversation_profile = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The bytes for conversationProfile to set.
     * @return This builder for chaining.
     */
    public Builder setConversationProfileBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      conversationProfile_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private int participantRole_ = 0;
    /**
     * <pre>
     * Required. The participant role to add or update the suggestion feature
     * config. Only HUMAN_AGENT or END_USER can be used.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.v2.Participant.Role participant_role = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The enum numeric value on the wire for participantRole.
     */
    @java.lang.Override public int getParticipantRoleValue() {
      return participantRole_;
    }
    /**
     * <pre>
     * Required. The participant role to add or update the suggestion feature
     * config. Only HUMAN_AGENT or END_USER can be used.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.v2.Participant.Role participant_role = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The enum numeric value on the wire for participantRole to set.
     * @return This builder for chaining.
     */
    public Builder setParticipantRoleValue(int value) {
      participantRole_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The participant role to add or update the suggestion feature
     * config. Only HUMAN_AGENT or END_USER can be used.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.v2.Participant.Role participant_role = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The participantRole.
     */
    @java.lang.Override
    public com.google.cloud.dialogflow.v2.Participant.Role getParticipantRole() {
      com.google.cloud.dialogflow.v2.Participant.Role result = com.google.cloud.dialogflow.v2.Participant.Role.forNumber(participantRole_);
      return result == null ? com.google.cloud.dialogflow.v2.Participant.Role.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * Required. The participant role to add or update the suggestion feature
     * config. Only HUMAN_AGENT or END_USER can be used.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.v2.Participant.Role participant_role = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The participantRole to set.
     * @return This builder for chaining.
     */
    public Builder setParticipantRole(com.google.cloud.dialogflow.v2.Participant.Role value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000002;
      participantRole_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The participant role to add or update the suggestion feature
     * config. Only HUMAN_AGENT or END_USER can be used.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.v2.Participant.Role participant_role = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return This builder for chaining.
     */
    public Builder clearParticipantRole() {
      bitField0_ = (bitField0_ & ~0x00000002);
      participantRole_ = 0;
      onChanged();
      return this;
    }

    private com.google.cloud.dialogflow.v2.HumanAgentAssistantConfig.SuggestionFeatureConfig suggestionFeatureConfig_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.dialogflow.v2.HumanAgentAssistantConfig.SuggestionFeatureConfig, com.google.cloud.dialogflow.v2.HumanAgentAssistantConfig.SuggestionFeatureConfig.Builder, com.google.cloud.dialogflow.v2.HumanAgentAssistantConfig.SuggestionFeatureConfigOrBuilder> suggestionFeatureConfigBuilder_;
    /**
     * <pre>
     * Required. The suggestion feature config to add or update.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.v2.HumanAgentAssistantConfig.SuggestionFeatureConfig suggestion_feature_config = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return Whether the suggestionFeatureConfig field is set.
     */
    public boolean hasSuggestionFeatureConfig() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <pre>
     * Required. The suggestion feature config to add or update.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.v2.HumanAgentAssistantConfig.SuggestionFeatureConfig suggestion_feature_config = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The suggestionFeatureConfig.
     */
    public com.google.cloud.dialogflow.v2.HumanAgentAssistantConfig.SuggestionFeatureConfig getSuggestionFeatureConfig() {
      if (suggestionFeatureConfigBuilder_ == null) {
        return suggestionFeatureConfig_ == null ? com.google.cloud.dialogflow.v2.HumanAgentAssistantConfig.SuggestionFeatureConfig.getDefaultInstance() : suggestionFeatureConfig_;
      } else {
        return suggestionFeatureConfigBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Required. The suggestion feature config to add or update.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.v2.HumanAgentAssistantConfig.SuggestionFeatureConfig suggestion_feature_config = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setSuggestionFeatureConfig(com.google.cloud.dialogflow.v2.HumanAgentAssistantConfig.SuggestionFeatureConfig value) {
      if (suggestionFeatureConfigBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        suggestionFeatureConfig_ = value;
      } else {
        suggestionFeatureConfigBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The suggestion feature config to add or update.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.v2.HumanAgentAssistantConfig.SuggestionFeatureConfig suggestion_feature_config = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setSuggestionFeatureConfig(
        com.google.cloud.dialogflow.v2.HumanAgentAssistantConfig.SuggestionFeatureConfig.Builder builderForValue) {
      if (suggestionFeatureConfigBuilder_ == null) {
        suggestionFeatureConfig_ = builderForValue.build();
      } else {
        suggestionFeatureConfigBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The suggestion feature config to add or update.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.v2.HumanAgentAssistantConfig.SuggestionFeatureConfig suggestion_feature_config = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder mergeSuggestionFeatureConfig(com.google.cloud.dialogflow.v2.HumanAgentAssistantConfig.SuggestionFeatureConfig value) {
      if (suggestionFeatureConfigBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0) &&
          suggestionFeatureConfig_ != null &&
          suggestionFeatureConfig_ != com.google.cloud.dialogflow.v2.HumanAgentAssistantConfig.SuggestionFeatureConfig.getDefaultInstance()) {
          getSuggestionFeatureConfigBuilder().mergeFrom(value);
        } else {
          suggestionFeatureConfig_ = value;
        }
      } else {
        suggestionFeatureConfigBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The suggestion feature config to add or update.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.v2.HumanAgentAssistantConfig.SuggestionFeatureConfig suggestion_feature_config = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder clearSuggestionFeatureConfig() {
      bitField0_ = (bitField0_ & ~0x00000004);
      suggestionFeatureConfig_ = null;
      if (suggestionFeatureConfigBuilder_ != null) {
        suggestionFeatureConfigBuilder_.dispose();
        suggestionFeatureConfigBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The suggestion feature config to add or update.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.v2.HumanAgentAssistantConfig.SuggestionFeatureConfig suggestion_feature_config = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.cloud.dialogflow.v2.HumanAgentAssistantConfig.SuggestionFeatureConfig.Builder getSuggestionFeatureConfigBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getSuggestionFeatureConfigFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Required. The suggestion feature config to add or update.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.v2.HumanAgentAssistantConfig.SuggestionFeatureConfig suggestion_feature_config = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.cloud.dialogflow.v2.HumanAgentAssistantConfig.SuggestionFeatureConfigOrBuilder getSuggestionFeatureConfigOrBuilder() {
      if (suggestionFeatureConfigBuilder_ != null) {
        return suggestionFeatureConfigBuilder_.getMessageOrBuilder();
      } else {
        return suggestionFeatureConfig_ == null ?
            com.google.cloud.dialogflow.v2.HumanAgentAssistantConfig.SuggestionFeatureConfig.getDefaultInstance() : suggestionFeatureConfig_;
      }
    }
    /**
     * <pre>
     * Required. The suggestion feature config to add or update.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.v2.HumanAgentAssistantConfig.SuggestionFeatureConfig suggestion_feature_config = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.dialogflow.v2.HumanAgentAssistantConfig.SuggestionFeatureConfig, com.google.cloud.dialogflow.v2.HumanAgentAssistantConfig.SuggestionFeatureConfig.Builder, com.google.cloud.dialogflow.v2.HumanAgentAssistantConfig.SuggestionFeatureConfigOrBuilder> 
        getSuggestionFeatureConfigFieldBuilder() {
      if (suggestionFeatureConfigBuilder_ == null) {
        suggestionFeatureConfigBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.dialogflow.v2.HumanAgentAssistantConfig.SuggestionFeatureConfig, com.google.cloud.dialogflow.v2.HumanAgentAssistantConfig.SuggestionFeatureConfig.Builder, com.google.cloud.dialogflow.v2.HumanAgentAssistantConfig.SuggestionFeatureConfigOrBuilder>(
                getSuggestionFeatureConfig(),
                getParentForChildren(),
                isClean());
        suggestionFeatureConfig_ = null;
      }
      return suggestionFeatureConfigBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.dialogflow.v2.SetSuggestionFeatureConfigRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.dialogflow.v2.SetSuggestionFeatureConfigRequest)
  private static final com.google.cloud.dialogflow.v2.SetSuggestionFeatureConfigRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.dialogflow.v2.SetSuggestionFeatureConfigRequest();
  }

  public static com.google.cloud.dialogflow.v2.SetSuggestionFeatureConfigRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SetSuggestionFeatureConfigRequest>
      PARSER = new com.google.protobuf.AbstractParser<SetSuggestionFeatureConfigRequest>() {
    @java.lang.Override
    public SetSuggestionFeatureConfigRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<SetSuggestionFeatureConfigRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SetSuggestionFeatureConfigRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.dialogflow.v2.SetSuggestionFeatureConfigRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

