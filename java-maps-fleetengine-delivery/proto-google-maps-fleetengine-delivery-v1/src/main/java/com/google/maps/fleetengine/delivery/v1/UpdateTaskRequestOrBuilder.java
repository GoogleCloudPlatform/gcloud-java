/*
 * Copyright 2024 Google LLC
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
// source: google/maps/fleetengine/delivery/v1/delivery_api.proto

// Protobuf Java Version: 3.25.5
package com.google.maps.fleetengine.delivery.v1;

public interface UpdateTaskRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:maps.fleetengine.delivery.v1.UpdateTaskRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Optional. The standard Delivery API request header.
   * </pre>
   *
   * <code>
   * .maps.fleetengine.delivery.v1.DeliveryRequestHeader header = 1 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the header field is set.
   */
  boolean hasHeader();
  /**
   *
   *
   * <pre>
   * Optional. The standard Delivery API request header.
   * </pre>
   *
   * <code>
   * .maps.fleetengine.delivery.v1.DeliveryRequestHeader header = 1 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The header.
   */
  com.google.maps.fleetengine.delivery.v1.DeliveryRequestHeader getHeader();
  /**
   *
   *
   * <pre>
   * Optional. The standard Delivery API request header.
   * </pre>
   *
   * <code>
   * .maps.fleetengine.delivery.v1.DeliveryRequestHeader header = 1 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.maps.fleetengine.delivery.v1.DeliveryRequestHeaderOrBuilder getHeaderOrBuilder();

  /**
   *
   *
   * <pre>
   * Required. The Task associated with the update.
   * The following fields are maintained by Fleet Engine. Do not update
   * them using `Task.update`.
   *
   *   * `last_location`.
   *   * `last_location_snappable`.
   *   * `name`.
   *   * `remaining_vehicle_journey_segments`.
   *   * `task_outcome_location_source`.
   *
   * Note: You cannot change the value of `task_outcome` once you set it.
   *
   * If the Task has been assigned to a delivery vehicle, then don't set the
   * Task state to CLOSED using `Task.update`. Instead, remove the `VehicleStop`
   * that contains the Task from the delivery vehicle, which automatically sets
   * the Task state to CLOSED.
   * </pre>
   *
   * <code>.maps.fleetengine.delivery.v1.Task task = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the task field is set.
   */
  boolean hasTask();
  /**
   *
   *
   * <pre>
   * Required. The Task associated with the update.
   * The following fields are maintained by Fleet Engine. Do not update
   * them using `Task.update`.
   *
   *   * `last_location`.
   *   * `last_location_snappable`.
   *   * `name`.
   *   * `remaining_vehicle_journey_segments`.
   *   * `task_outcome_location_source`.
   *
   * Note: You cannot change the value of `task_outcome` once you set it.
   *
   * If the Task has been assigned to a delivery vehicle, then don't set the
   * Task state to CLOSED using `Task.update`. Instead, remove the `VehicleStop`
   * that contains the Task from the delivery vehicle, which automatically sets
   * the Task state to CLOSED.
   * </pre>
   *
   * <code>.maps.fleetengine.delivery.v1.Task task = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The task.
   */
  com.google.maps.fleetengine.delivery.v1.Task getTask();
  /**
   *
   *
   * <pre>
   * Required. The Task associated with the update.
   * The following fields are maintained by Fleet Engine. Do not update
   * them using `Task.update`.
   *
   *   * `last_location`.
   *   * `last_location_snappable`.
   *   * `name`.
   *   * `remaining_vehicle_journey_segments`.
   *   * `task_outcome_location_source`.
   *
   * Note: You cannot change the value of `task_outcome` once you set it.
   *
   * If the Task has been assigned to a delivery vehicle, then don't set the
   * Task state to CLOSED using `Task.update`. Instead, remove the `VehicleStop`
   * that contains the Task from the delivery vehicle, which automatically sets
   * the Task state to CLOSED.
   * </pre>
   *
   * <code>.maps.fleetengine.delivery.v1.Task task = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.maps.fleetengine.delivery.v1.TaskOrBuilder getTaskOrBuilder();

  /**
   *
   *
   * <pre>
   * Required. The field mask that indicates which Task fields to update.
   * Note: The `update_mask` must contain at least one field.
   *
   * This is a comma-separated list of fully qualified names of fields. Example:
   * `"task_outcome,task_outcome_time,task_outcome_location"`.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 4 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the updateMask field is set.
   */
  boolean hasUpdateMask();
  /**
   *
   *
   * <pre>
   * Required. The field mask that indicates which Task fields to update.
   * Note: The `update_mask` must contain at least one field.
   *
   * This is a comma-separated list of fully qualified names of fields. Example:
   * `"task_outcome,task_outcome_time,task_outcome_location"`.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 4 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The updateMask.
   */
  com.google.protobuf.FieldMask getUpdateMask();
  /**
   *
   *
   * <pre>
   * Required. The field mask that indicates which Task fields to update.
   * Note: The `update_mask` must contain at least one field.
   *
   * This is a comma-separated list of fully qualified names of fields. Example:
   * `"task_outcome,task_outcome_time,task_outcome_location"`.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 4 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();
}
