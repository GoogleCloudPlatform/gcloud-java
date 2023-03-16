// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dialogflow/v2beta1/fulfillment.proto

package com.google.cloud.dialogflow.v2beta1;

public interface UpdateFulfillmentRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.v2beta1.UpdateFulfillmentRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The fulfillment to update.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2beta1.Fulfillment fulfillment = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the fulfillment field is set.
   */
  boolean hasFulfillment();
  /**
   * <pre>
   * Required. The fulfillment to update.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2beta1.Fulfillment fulfillment = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The fulfillment.
   */
  com.google.cloud.dialogflow.v2beta1.Fulfillment getFulfillment();
  /**
   * <pre>
   * Required. The fulfillment to update.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2beta1.Fulfillment fulfillment = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.cloud.dialogflow.v2beta1.FulfillmentOrBuilder getFulfillmentOrBuilder();

  /**
   * <pre>
   * Required. The mask to control which fields get updated. If the mask is not
   * present, all fields will be updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the updateMask field is set.
   */
  boolean hasUpdateMask();
  /**
   * <pre>
   * Required. The mask to control which fields get updated. If the mask is not
   * present, all fields will be updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The updateMask.
   */
  com.google.protobuf.FieldMask getUpdateMask();
  /**
   * <pre>
   * Required. The mask to control which fields get updated. If the mask is not
   * present, all fields will be updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();
}
