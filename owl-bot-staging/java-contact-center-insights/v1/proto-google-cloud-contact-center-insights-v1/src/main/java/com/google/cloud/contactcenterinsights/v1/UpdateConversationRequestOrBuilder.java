// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/contactcenterinsights/v1/contact_center_insights.proto

package com.google.cloud.contactcenterinsights.v1;

public interface UpdateConversationRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.contactcenterinsights.v1.UpdateConversationRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The new values for the conversation.
   * </pre>
   *
   * <code>.google.cloud.contactcenterinsights.v1.Conversation conversation = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the conversation field is set.
   */
  boolean hasConversation();
  /**
   * <pre>
   * Required. The new values for the conversation.
   * </pre>
   *
   * <code>.google.cloud.contactcenterinsights.v1.Conversation conversation = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The conversation.
   */
  com.google.cloud.contactcenterinsights.v1.Conversation getConversation();
  /**
   * <pre>
   * Required. The new values for the conversation.
   * </pre>
   *
   * <code>.google.cloud.contactcenterinsights.v1.Conversation conversation = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.cloud.contactcenterinsights.v1.ConversationOrBuilder getConversationOrBuilder();

  /**
   * <pre>
   * The list of fields to be updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   * @return Whether the updateMask field is set.
   */
  boolean hasUpdateMask();
  /**
   * <pre>
   * The list of fields to be updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   * @return The updateMask.
   */
  com.google.protobuf.FieldMask getUpdateMask();
  /**
   * <pre>
   * The list of fields to be updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();
}
