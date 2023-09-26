// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/resourcesettings/v1/resource_settings.proto

package com.google.cloud.resourcesettings.v1;

public interface ListSettingsRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.resourcesettings.v1.ListSettingsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The Cloud resource that parents the setting. Must be in one of the
   * following forms:
   *
   * * `projects/{project_number}`
   * * `projects/{project_id}`
   * * `folders/{folder_id}`
   * * `organizations/{organization_id}`
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   * <pre>
   * Required. The Cloud resource that parents the setting. Must be in one of the
   * following forms:
   *
   * * `projects/{project_number}`
   * * `projects/{project_id}`
   * * `folders/{folder_id}`
   * * `organizations/{organization_id}`
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString
      getParentBytes();

  /**
   * <pre>
   * Unused. The size of the page to be returned.
   * </pre>
   *
   * <code>int32 page_size = 2;</code>
   * @return The pageSize.
   */
  int getPageSize();

  /**
   * <pre>
   * Unused. A page token used to retrieve the next page.
   * </pre>
   *
   * <code>string page_token = 3;</code>
   * @return The pageToken.
   */
  java.lang.String getPageToken();
  /**
   * <pre>
   * Unused. A page token used to retrieve the next page.
   * </pre>
   *
   * <code>string page_token = 3;</code>
   * @return The bytes for pageToken.
   */
  com.google.protobuf.ByteString
      getPageTokenBytes();

  /**
   * <pre>
   * The SettingView for this request.
   * </pre>
   *
   * <code>.google.cloud.resourcesettings.v1.SettingView view = 4;</code>
   * @return The enum numeric value on the wire for view.
   */
  int getViewValue();
  /**
   * <pre>
   * The SettingView for this request.
   * </pre>
   *
   * <code>.google.cloud.resourcesettings.v1.SettingView view = 4;</code>
   * @return The view.
   */
  com.google.cloud.resourcesettings.v1.SettingView getView();
}
