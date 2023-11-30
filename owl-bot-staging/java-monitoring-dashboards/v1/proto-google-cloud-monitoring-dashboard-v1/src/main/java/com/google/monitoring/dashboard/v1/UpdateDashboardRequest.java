// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/monitoring/dashboard/v1/dashboards_service.proto

package com.google.monitoring.dashboard.v1;

/**
 * <pre>
 * The `UpdateDashboard` request.
 * </pre>
 *
 * Protobuf type {@code google.monitoring.dashboard.v1.UpdateDashboardRequest}
 */
public final class UpdateDashboardRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.monitoring.dashboard.v1.UpdateDashboardRequest)
    UpdateDashboardRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UpdateDashboardRequest.newBuilder() to construct.
  private UpdateDashboardRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UpdateDashboardRequest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new UpdateDashboardRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.monitoring.dashboard.v1.DashboardsServiceProto.internal_static_google_monitoring_dashboard_v1_UpdateDashboardRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.monitoring.dashboard.v1.DashboardsServiceProto.internal_static_google_monitoring_dashboard_v1_UpdateDashboardRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.monitoring.dashboard.v1.UpdateDashboardRequest.class, com.google.monitoring.dashboard.v1.UpdateDashboardRequest.Builder.class);
  }

  public static final int DASHBOARD_FIELD_NUMBER = 1;
  private com.google.monitoring.dashboard.v1.Dashboard dashboard_;
  /**
   * <pre>
   * Required. The dashboard that will replace the existing dashboard.
   * </pre>
   *
   * <code>.google.monitoring.dashboard.v1.Dashboard dashboard = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the dashboard field is set.
   */
  @java.lang.Override
  public boolean hasDashboard() {
    return dashboard_ != null;
  }
  /**
   * <pre>
   * Required. The dashboard that will replace the existing dashboard.
   * </pre>
   *
   * <code>.google.monitoring.dashboard.v1.Dashboard dashboard = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The dashboard.
   */
  @java.lang.Override
  public com.google.monitoring.dashboard.v1.Dashboard getDashboard() {
    return dashboard_ == null ? com.google.monitoring.dashboard.v1.Dashboard.getDefaultInstance() : dashboard_;
  }
  /**
   * <pre>
   * Required. The dashboard that will replace the existing dashboard.
   * </pre>
   *
   * <code>.google.monitoring.dashboard.v1.Dashboard dashboard = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  @java.lang.Override
  public com.google.monitoring.dashboard.v1.DashboardOrBuilder getDashboardOrBuilder() {
    return dashboard_ == null ? com.google.monitoring.dashboard.v1.Dashboard.getDefaultInstance() : dashboard_;
  }

  public static final int VALIDATE_ONLY_FIELD_NUMBER = 3;
  private boolean validateOnly_ = false;
  /**
   * <pre>
   * If set, validate the request and preview the review, but do not actually
   * save it.
   * </pre>
   *
   * <code>bool validate_only = 3;</code>
   * @return The validateOnly.
   */
  @java.lang.Override
  public boolean getValidateOnly() {
    return validateOnly_;
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
    if (dashboard_ != null) {
      output.writeMessage(1, getDashboard());
    }
    if (validateOnly_ != false) {
      output.writeBool(3, validateOnly_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (dashboard_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getDashboard());
    }
    if (validateOnly_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(3, validateOnly_);
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
    if (!(obj instanceof com.google.monitoring.dashboard.v1.UpdateDashboardRequest)) {
      return super.equals(obj);
    }
    com.google.monitoring.dashboard.v1.UpdateDashboardRequest other = (com.google.monitoring.dashboard.v1.UpdateDashboardRequest) obj;

    if (hasDashboard() != other.hasDashboard()) return false;
    if (hasDashboard()) {
      if (!getDashboard()
          .equals(other.getDashboard())) return false;
    }
    if (getValidateOnly()
        != other.getValidateOnly()) return false;
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
    if (hasDashboard()) {
      hash = (37 * hash) + DASHBOARD_FIELD_NUMBER;
      hash = (53 * hash) + getDashboard().hashCode();
    }
    hash = (37 * hash) + VALIDATE_ONLY_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getValidateOnly());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.monitoring.dashboard.v1.UpdateDashboardRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.monitoring.dashboard.v1.UpdateDashboardRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.monitoring.dashboard.v1.UpdateDashboardRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.monitoring.dashboard.v1.UpdateDashboardRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.monitoring.dashboard.v1.UpdateDashboardRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.monitoring.dashboard.v1.UpdateDashboardRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.monitoring.dashboard.v1.UpdateDashboardRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.monitoring.dashboard.v1.UpdateDashboardRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.monitoring.dashboard.v1.UpdateDashboardRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.monitoring.dashboard.v1.UpdateDashboardRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.monitoring.dashboard.v1.UpdateDashboardRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.monitoring.dashboard.v1.UpdateDashboardRequest parseFrom(
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
  public static Builder newBuilder(com.google.monitoring.dashboard.v1.UpdateDashboardRequest prototype) {
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
   * The `UpdateDashboard` request.
   * </pre>
   *
   * Protobuf type {@code google.monitoring.dashboard.v1.UpdateDashboardRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.monitoring.dashboard.v1.UpdateDashboardRequest)
      com.google.monitoring.dashboard.v1.UpdateDashboardRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.monitoring.dashboard.v1.DashboardsServiceProto.internal_static_google_monitoring_dashboard_v1_UpdateDashboardRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.monitoring.dashboard.v1.DashboardsServiceProto.internal_static_google_monitoring_dashboard_v1_UpdateDashboardRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.monitoring.dashboard.v1.UpdateDashboardRequest.class, com.google.monitoring.dashboard.v1.UpdateDashboardRequest.Builder.class);
    }

    // Construct using com.google.monitoring.dashboard.v1.UpdateDashboardRequest.newBuilder()
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
      dashboard_ = null;
      if (dashboardBuilder_ != null) {
        dashboardBuilder_.dispose();
        dashboardBuilder_ = null;
      }
      validateOnly_ = false;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.monitoring.dashboard.v1.DashboardsServiceProto.internal_static_google_monitoring_dashboard_v1_UpdateDashboardRequest_descriptor;
    }

    @java.lang.Override
    public com.google.monitoring.dashboard.v1.UpdateDashboardRequest getDefaultInstanceForType() {
      return com.google.monitoring.dashboard.v1.UpdateDashboardRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.monitoring.dashboard.v1.UpdateDashboardRequest build() {
      com.google.monitoring.dashboard.v1.UpdateDashboardRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.monitoring.dashboard.v1.UpdateDashboardRequest buildPartial() {
      com.google.monitoring.dashboard.v1.UpdateDashboardRequest result = new com.google.monitoring.dashboard.v1.UpdateDashboardRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.monitoring.dashboard.v1.UpdateDashboardRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.dashboard_ = dashboardBuilder_ == null
            ? dashboard_
            : dashboardBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.validateOnly_ = validateOnly_;
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
      if (other instanceof com.google.monitoring.dashboard.v1.UpdateDashboardRequest) {
        return mergeFrom((com.google.monitoring.dashboard.v1.UpdateDashboardRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.monitoring.dashboard.v1.UpdateDashboardRequest other) {
      if (other == com.google.monitoring.dashboard.v1.UpdateDashboardRequest.getDefaultInstance()) return this;
      if (other.hasDashboard()) {
        mergeDashboard(other.getDashboard());
      }
      if (other.getValidateOnly() != false) {
        setValidateOnly(other.getValidateOnly());
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
                  getDashboardFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 24: {
              validateOnly_ = input.readBool();
              bitField0_ |= 0x00000002;
              break;
            } // case 24
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

    private com.google.monitoring.dashboard.v1.Dashboard dashboard_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.monitoring.dashboard.v1.Dashboard, com.google.monitoring.dashboard.v1.Dashboard.Builder, com.google.monitoring.dashboard.v1.DashboardOrBuilder> dashboardBuilder_;
    /**
     * <pre>
     * Required. The dashboard that will replace the existing dashboard.
     * </pre>
     *
     * <code>.google.monitoring.dashboard.v1.Dashboard dashboard = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return Whether the dashboard field is set.
     */
    public boolean hasDashboard() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * Required. The dashboard that will replace the existing dashboard.
     * </pre>
     *
     * <code>.google.monitoring.dashboard.v1.Dashboard dashboard = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The dashboard.
     */
    public com.google.monitoring.dashboard.v1.Dashboard getDashboard() {
      if (dashboardBuilder_ == null) {
        return dashboard_ == null ? com.google.monitoring.dashboard.v1.Dashboard.getDefaultInstance() : dashboard_;
      } else {
        return dashboardBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Required. The dashboard that will replace the existing dashboard.
     * </pre>
     *
     * <code>.google.monitoring.dashboard.v1.Dashboard dashboard = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setDashboard(com.google.monitoring.dashboard.v1.Dashboard value) {
      if (dashboardBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        dashboard_ = value;
      } else {
        dashboardBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The dashboard that will replace the existing dashboard.
     * </pre>
     *
     * <code>.google.monitoring.dashboard.v1.Dashboard dashboard = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setDashboard(
        com.google.monitoring.dashboard.v1.Dashboard.Builder builderForValue) {
      if (dashboardBuilder_ == null) {
        dashboard_ = builderForValue.build();
      } else {
        dashboardBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The dashboard that will replace the existing dashboard.
     * </pre>
     *
     * <code>.google.monitoring.dashboard.v1.Dashboard dashboard = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder mergeDashboard(com.google.monitoring.dashboard.v1.Dashboard value) {
      if (dashboardBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          dashboard_ != null &&
          dashboard_ != com.google.monitoring.dashboard.v1.Dashboard.getDefaultInstance()) {
          getDashboardBuilder().mergeFrom(value);
        } else {
          dashboard_ = value;
        }
      } else {
        dashboardBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The dashboard that will replace the existing dashboard.
     * </pre>
     *
     * <code>.google.monitoring.dashboard.v1.Dashboard dashboard = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder clearDashboard() {
      bitField0_ = (bitField0_ & ~0x00000001);
      dashboard_ = null;
      if (dashboardBuilder_ != null) {
        dashboardBuilder_.dispose();
        dashboardBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The dashboard that will replace the existing dashboard.
     * </pre>
     *
     * <code>.google.monitoring.dashboard.v1.Dashboard dashboard = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.monitoring.dashboard.v1.Dashboard.Builder getDashboardBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getDashboardFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Required. The dashboard that will replace the existing dashboard.
     * </pre>
     *
     * <code>.google.monitoring.dashboard.v1.Dashboard dashboard = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.monitoring.dashboard.v1.DashboardOrBuilder getDashboardOrBuilder() {
      if (dashboardBuilder_ != null) {
        return dashboardBuilder_.getMessageOrBuilder();
      } else {
        return dashboard_ == null ?
            com.google.monitoring.dashboard.v1.Dashboard.getDefaultInstance() : dashboard_;
      }
    }
    /**
     * <pre>
     * Required. The dashboard that will replace the existing dashboard.
     * </pre>
     *
     * <code>.google.monitoring.dashboard.v1.Dashboard dashboard = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.monitoring.dashboard.v1.Dashboard, com.google.monitoring.dashboard.v1.Dashboard.Builder, com.google.monitoring.dashboard.v1.DashboardOrBuilder> 
        getDashboardFieldBuilder() {
      if (dashboardBuilder_ == null) {
        dashboardBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.monitoring.dashboard.v1.Dashboard, com.google.monitoring.dashboard.v1.Dashboard.Builder, com.google.monitoring.dashboard.v1.DashboardOrBuilder>(
                getDashboard(),
                getParentForChildren(),
                isClean());
        dashboard_ = null;
      }
      return dashboardBuilder_;
    }

    private boolean validateOnly_ ;
    /**
     * <pre>
     * If set, validate the request and preview the review, but do not actually
     * save it.
     * </pre>
     *
     * <code>bool validate_only = 3;</code>
     * @return The validateOnly.
     */
    @java.lang.Override
    public boolean getValidateOnly() {
      return validateOnly_;
    }
    /**
     * <pre>
     * If set, validate the request and preview the review, but do not actually
     * save it.
     * </pre>
     *
     * <code>bool validate_only = 3;</code>
     * @param value The validateOnly to set.
     * @return This builder for chaining.
     */
    public Builder setValidateOnly(boolean value) {

      validateOnly_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * If set, validate the request and preview the review, but do not actually
     * save it.
     * </pre>
     *
     * <code>bool validate_only = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearValidateOnly() {
      bitField0_ = (bitField0_ & ~0x00000002);
      validateOnly_ = false;
      onChanged();
      return this;
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


    // @@protoc_insertion_point(builder_scope:google.monitoring.dashboard.v1.UpdateDashboardRequest)
  }

  // @@protoc_insertion_point(class_scope:google.monitoring.dashboard.v1.UpdateDashboardRequest)
  private static final com.google.monitoring.dashboard.v1.UpdateDashboardRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.monitoring.dashboard.v1.UpdateDashboardRequest();
  }

  public static com.google.monitoring.dashboard.v1.UpdateDashboardRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateDashboardRequest>
      PARSER = new com.google.protobuf.AbstractParser<UpdateDashboardRequest>() {
    @java.lang.Override
    public UpdateDashboardRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<UpdateDashboardRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateDashboardRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.monitoring.dashboard.v1.UpdateDashboardRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

