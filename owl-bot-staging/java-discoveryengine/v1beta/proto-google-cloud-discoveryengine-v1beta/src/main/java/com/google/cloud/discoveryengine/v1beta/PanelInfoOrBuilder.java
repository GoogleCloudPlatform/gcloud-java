// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/discoveryengine/v1beta/user_event.proto

package com.google.cloud.discoveryengine.v1beta;

public interface PanelInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.discoveryengine.v1beta.PanelInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The panel ID.
   * </pre>
   *
   * <code>string panel_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The panelId.
   */
  java.lang.String getPanelId();
  /**
   * <pre>
   * Required. The panel ID.
   * </pre>
   *
   * <code>string panel_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for panelId.
   */
  com.google.protobuf.ByteString
      getPanelIdBytes();

  /**
   * <pre>
   * The display name of the panel.
   * </pre>
   *
   * <code>string display_name = 3;</code>
   * @return The displayName.
   */
  java.lang.String getDisplayName();
  /**
   * <pre>
   * The display name of the panel.
   * </pre>
   *
   * <code>string display_name = 3;</code>
   * @return The bytes for displayName.
   */
  com.google.protobuf.ByteString
      getDisplayNameBytes();

  /**
   * <pre>
   * The ordered position of the panel, if shown to the user with other panels.
   * If set, then
   * [total_panels][google.cloud.discoveryengine.v1beta.PanelInfo.total_panels]
   * must also be set.
   * </pre>
   *
   * <code>optional int32 panel_position = 4;</code>
   * @return Whether the panelPosition field is set.
   */
  boolean hasPanelPosition();
  /**
   * <pre>
   * The ordered position of the panel, if shown to the user with other panels.
   * If set, then
   * [total_panels][google.cloud.discoveryengine.v1beta.PanelInfo.total_panels]
   * must also be set.
   * </pre>
   *
   * <code>optional int32 panel_position = 4;</code>
   * @return The panelPosition.
   */
  int getPanelPosition();

  /**
   * <pre>
   * The total number of panels, including this one, shown to the user.
   * Must be set if
   * [panel_position][google.cloud.discoveryengine.v1beta.PanelInfo.panel_position]
   * is set.
   * </pre>
   *
   * <code>optional int32 total_panels = 5;</code>
   * @return Whether the totalPanels field is set.
   */
  boolean hasTotalPanels();
  /**
   * <pre>
   * The total number of panels, including this one, shown to the user.
   * Must be set if
   * [panel_position][google.cloud.discoveryengine.v1beta.PanelInfo.panel_position]
   * is set.
   * </pre>
   *
   * <code>optional int32 total_panels = 5;</code>
   * @return The totalPanels.
   */
  int getTotalPanels();
}
