// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/servicedirectory/v1beta1/registration_service.proto

package com.google.cloud.servicedirectory.v1beta1;

public interface UpdateServiceRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.servicedirectory.v1beta1.UpdateServiceRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The updated service.
   * </pre>
   *
   * <code>.google.cloud.servicedirectory.v1beta1.Service service = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the service field is set.
   */
  boolean hasService();
  /**
   * <pre>
   * Required. The updated service.
   * </pre>
   *
   * <code>.google.cloud.servicedirectory.v1beta1.Service service = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The service.
   */
  com.google.cloud.servicedirectory.v1beta1.Service getService();
  /**
   * <pre>
   * Required. The updated service.
   * </pre>
   *
   * <code>.google.cloud.servicedirectory.v1beta1.Service service = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.cloud.servicedirectory.v1beta1.ServiceOrBuilder getServiceOrBuilder();

  /**
   * <pre>
   * Required. List of fields to be updated in this request.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the updateMask field is set.
   */
  boolean hasUpdateMask();
  /**
   * <pre>
   * Required. List of fields to be updated in this request.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The updateMask.
   */
  com.google.protobuf.FieldMask getUpdateMask();
  /**
   * <pre>
   * Required. List of fields to be updated in this request.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();
}
