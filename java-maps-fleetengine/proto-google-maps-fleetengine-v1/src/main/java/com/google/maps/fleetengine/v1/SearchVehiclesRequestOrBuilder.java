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
// source: google/maps/fleetengine/v1/vehicle_api.proto

// Protobuf Java Version: 3.25.5
package com.google.maps.fleetengine.v1;

public interface SearchVehiclesRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:maps.fleetengine.v1.SearchVehiclesRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The standard Fleet Engine request header.
   * </pre>
   *
   * <code>.maps.fleetengine.v1.RequestHeader header = 1;</code>
   *
   * @return Whether the header field is set.
   */
  boolean hasHeader();
  /**
   *
   *
   * <pre>
   * The standard Fleet Engine request header.
   * </pre>
   *
   * <code>.maps.fleetengine.v1.RequestHeader header = 1;</code>
   *
   * @return The header.
   */
  com.google.maps.fleetengine.v1.RequestHeader getHeader();
  /**
   *
   *
   * <pre>
   * The standard Fleet Engine request header.
   * </pre>
   *
   * <code>.maps.fleetengine.v1.RequestHeader header = 1;</code>
   */
  com.google.maps.fleetengine.v1.RequestHeaderOrBuilder getHeaderOrBuilder();

  /**
   *
   *
   * <pre>
   * Required. Must be in the format `providers/{provider}`.
   * The provider must be the Project ID (for example, `sample-cloud-project`)
   * of the Google Cloud Project of which the service account making
   * this call is a member.
   * </pre>
   *
   * <code>string parent = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   *
   *
   * <pre>
   * Required. Must be in the format `providers/{provider}`.
   * The provider must be the Project ID (for example, `sample-cloud-project`)
   * of the Google Cloud Project of which the service account making
   * this call is a member.
   * </pre>
   *
   * <code>string parent = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString getParentBytes();

  /**
   *
   *
   * <pre>
   * Required. The pickup point to search near.
   * </pre>
   *
   * <code>
   * .maps.fleetengine.v1.TerminalLocation pickup_point = 4 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the pickupPoint field is set.
   */
  boolean hasPickupPoint();
  /**
   *
   *
   * <pre>
   * Required. The pickup point to search near.
   * </pre>
   *
   * <code>
   * .maps.fleetengine.v1.TerminalLocation pickup_point = 4 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The pickupPoint.
   */
  com.google.maps.fleetengine.v1.TerminalLocation getPickupPoint();
  /**
   *
   *
   * <pre>
   * Required. The pickup point to search near.
   * </pre>
   *
   * <code>
   * .maps.fleetengine.v1.TerminalLocation pickup_point = 4 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.maps.fleetengine.v1.TerminalLocationOrBuilder getPickupPointOrBuilder();

  /**
   *
   *
   * <pre>
   * The customer's intended dropoff location. The field is required if
   * `trip_types` contains `TripType.SHARED`.
   * </pre>
   *
   * <code>.maps.fleetengine.v1.TerminalLocation dropoff_point = 5;</code>
   *
   * @return Whether the dropoffPoint field is set.
   */
  boolean hasDropoffPoint();
  /**
   *
   *
   * <pre>
   * The customer's intended dropoff location. The field is required if
   * `trip_types` contains `TripType.SHARED`.
   * </pre>
   *
   * <code>.maps.fleetengine.v1.TerminalLocation dropoff_point = 5;</code>
   *
   * @return The dropoffPoint.
   */
  com.google.maps.fleetengine.v1.TerminalLocation getDropoffPoint();
  /**
   *
   *
   * <pre>
   * The customer's intended dropoff location. The field is required if
   * `trip_types` contains `TripType.SHARED`.
   * </pre>
   *
   * <code>.maps.fleetengine.v1.TerminalLocation dropoff_point = 5;</code>
   */
  com.google.maps.fleetengine.v1.TerminalLocationOrBuilder getDropoffPointOrBuilder();

  /**
   *
   *
   * <pre>
   * Required. Defines the vehicle search radius around the pickup point. Only
   * vehicles within the search radius will be returned. Value must be between
   * 400 and 10000 meters (inclusive).
   * </pre>
   *
   * <code>int32 pickup_radius_meters = 6 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The pickupRadiusMeters.
   */
  int getPickupRadiusMeters();

  /**
   *
   *
   * <pre>
   * Required. Specifies the maximum number of vehicles to return. The value
   * must be between 1 and 50 (inclusive).
   * </pre>
   *
   * <code>int32 count = 7 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The count.
   */
  int getCount();

  /**
   *
   *
   * <pre>
   * Required. Specifies the number of passengers being considered for a trip.
   * The value must be greater than or equal to one. The driver is not
   * considered in the capacity value.
   * </pre>
   *
   * <code>int32 minimum_capacity = 8 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The minimumCapacity.
   */
  int getMinimumCapacity();

  /**
   *
   *
   * <pre>
   * Required. Represents the type of proposed trip. Must include exactly one
   * type. `UNKNOWN_TRIP_TYPE` is not allowed. Restricts the search to only
   * those vehicles that can support that trip type.
   * </pre>
   *
   * <code>
   * repeated .maps.fleetengine.v1.TripType trip_types = 9 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return A list containing the tripTypes.
   */
  java.util.List<com.google.maps.fleetengine.v1.TripType> getTripTypesList();
  /**
   *
   *
   * <pre>
   * Required. Represents the type of proposed trip. Must include exactly one
   * type. `UNKNOWN_TRIP_TYPE` is not allowed. Restricts the search to only
   * those vehicles that can support that trip type.
   * </pre>
   *
   * <code>
   * repeated .maps.fleetengine.v1.TripType trip_types = 9 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The count of tripTypes.
   */
  int getTripTypesCount();
  /**
   *
   *
   * <pre>
   * Required. Represents the type of proposed trip. Must include exactly one
   * type. `UNKNOWN_TRIP_TYPE` is not allowed. Restricts the search to only
   * those vehicles that can support that trip type.
   * </pre>
   *
   * <code>
   * repeated .maps.fleetengine.v1.TripType trip_types = 9 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @param index The index of the element to return.
   * @return The tripTypes at the given index.
   */
  com.google.maps.fleetengine.v1.TripType getTripTypes(int index);
  /**
   *
   *
   * <pre>
   * Required. Represents the type of proposed trip. Must include exactly one
   * type. `UNKNOWN_TRIP_TYPE` is not allowed. Restricts the search to only
   * those vehicles that can support that trip type.
   * </pre>
   *
   * <code>
   * repeated .maps.fleetengine.v1.TripType trip_types = 9 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return A list containing the enum numeric values on the wire for tripTypes.
   */
  java.util.List<java.lang.Integer> getTripTypesValueList();
  /**
   *
   *
   * <pre>
   * Required. Represents the type of proposed trip. Must include exactly one
   * type. `UNKNOWN_TRIP_TYPE` is not allowed. Restricts the search to only
   * those vehicles that can support that trip type.
   * </pre>
   *
   * <code>
   * repeated .maps.fleetengine.v1.TripType trip_types = 9 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of tripTypes at the given index.
   */
  int getTripTypesValue(int index);

  /**
   *
   *
   * <pre>
   * Restricts the search to only those vehicles that have sent location updates
   * to Fleet Engine within the specified duration. Stationary vehicles still
   * transmitting their locations are not considered stale. If this field is not
   * set, the server uses five minutes as the default value.
   * </pre>
   *
   * <code>.google.protobuf.Duration maximum_staleness = 10;</code>
   *
   * @return Whether the maximumStaleness field is set.
   */
  boolean hasMaximumStaleness();
  /**
   *
   *
   * <pre>
   * Restricts the search to only those vehicles that have sent location updates
   * to Fleet Engine within the specified duration. Stationary vehicles still
   * transmitting their locations are not considered stale. If this field is not
   * set, the server uses five minutes as the default value.
   * </pre>
   *
   * <code>.google.protobuf.Duration maximum_staleness = 10;</code>
   *
   * @return The maximumStaleness.
   */
  com.google.protobuf.Duration getMaximumStaleness();
  /**
   *
   *
   * <pre>
   * Restricts the search to only those vehicles that have sent location updates
   * to Fleet Engine within the specified duration. Stationary vehicles still
   * transmitting their locations are not considered stale. If this field is not
   * set, the server uses five minutes as the default value.
   * </pre>
   *
   * <code>.google.protobuf.Duration maximum_staleness = 10;</code>
   */
  com.google.protobuf.DurationOrBuilder getMaximumStalenessOrBuilder();

  /**
   *
   *
   * <pre>
   * Required. Restricts the search to vehicles with one of the specified types.
   * At least one vehicle type must be specified. VehicleTypes with a category
   * of `UNKNOWN` are not allowed.
   * </pre>
   *
   * <code>
   * repeated .maps.fleetengine.v1.Vehicle.VehicleType vehicle_types = 14 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  java.util.List<com.google.maps.fleetengine.v1.Vehicle.VehicleType> getVehicleTypesList();
  /**
   *
   *
   * <pre>
   * Required. Restricts the search to vehicles with one of the specified types.
   * At least one vehicle type must be specified. VehicleTypes with a category
   * of `UNKNOWN` are not allowed.
   * </pre>
   *
   * <code>
   * repeated .maps.fleetengine.v1.Vehicle.VehicleType vehicle_types = 14 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.maps.fleetengine.v1.Vehicle.VehicleType getVehicleTypes(int index);
  /**
   *
   *
   * <pre>
   * Required. Restricts the search to vehicles with one of the specified types.
   * At least one vehicle type must be specified. VehicleTypes with a category
   * of `UNKNOWN` are not allowed.
   * </pre>
   *
   * <code>
   * repeated .maps.fleetengine.v1.Vehicle.VehicleType vehicle_types = 14 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  int getVehicleTypesCount();
  /**
   *
   *
   * <pre>
   * Required. Restricts the search to vehicles with one of the specified types.
   * At least one vehicle type must be specified. VehicleTypes with a category
   * of `UNKNOWN` are not allowed.
   * </pre>
   *
   * <code>
   * repeated .maps.fleetengine.v1.Vehicle.VehicleType vehicle_types = 14 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  java.util.List<? extends com.google.maps.fleetengine.v1.Vehicle.VehicleTypeOrBuilder>
      getVehicleTypesOrBuilderList();
  /**
   *
   *
   * <pre>
   * Required. Restricts the search to vehicles with one of the specified types.
   * At least one vehicle type must be specified. VehicleTypes with a category
   * of `UNKNOWN` are not allowed.
   * </pre>
   *
   * <code>
   * repeated .maps.fleetengine.v1.Vehicle.VehicleType vehicle_types = 14 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.maps.fleetengine.v1.Vehicle.VehicleTypeOrBuilder getVehicleTypesOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Callers can form complex logical operations using any combination of the
   * `required_attributes`, `required_one_of_attributes`, and
   * `required_one_of_attribute_sets` fields.
   *
   * `required_attributes` is a list; `required_one_of_attributes` uses a
   * message which allows a list of lists. In combination, the two fields allow
   * the composition of this expression:
   *
   * ```
   * (required_attributes[0] AND required_attributes[1] AND ...)
   * AND
   * (required_one_of_attributes[0][0] OR required_one_of_attributes[0][1] OR
   * ...)
   * AND
   * (required_one_of_attributes[1][0] OR required_one_of_attributes[1][1] OR
   * ...)
   * ```
   *
   * Restricts the search to only those vehicles with the specified attributes.
   * This field is a conjunction/AND operation. A max of 50 required_attributes
   * is allowed. This matches the maximum number of attributes allowed on a
   * vehicle.
   * </pre>
   *
   * <code>repeated .maps.fleetengine.v1.VehicleAttribute required_attributes = 12;</code>
   */
  java.util.List<com.google.maps.fleetengine.v1.VehicleAttribute> getRequiredAttributesList();
  /**
   *
   *
   * <pre>
   * Callers can form complex logical operations using any combination of the
   * `required_attributes`, `required_one_of_attributes`, and
   * `required_one_of_attribute_sets` fields.
   *
   * `required_attributes` is a list; `required_one_of_attributes` uses a
   * message which allows a list of lists. In combination, the two fields allow
   * the composition of this expression:
   *
   * ```
   * (required_attributes[0] AND required_attributes[1] AND ...)
   * AND
   * (required_one_of_attributes[0][0] OR required_one_of_attributes[0][1] OR
   * ...)
   * AND
   * (required_one_of_attributes[1][0] OR required_one_of_attributes[1][1] OR
   * ...)
   * ```
   *
   * Restricts the search to only those vehicles with the specified attributes.
   * This field is a conjunction/AND operation. A max of 50 required_attributes
   * is allowed. This matches the maximum number of attributes allowed on a
   * vehicle.
   * </pre>
   *
   * <code>repeated .maps.fleetengine.v1.VehicleAttribute required_attributes = 12;</code>
   */
  com.google.maps.fleetengine.v1.VehicleAttribute getRequiredAttributes(int index);
  /**
   *
   *
   * <pre>
   * Callers can form complex logical operations using any combination of the
   * `required_attributes`, `required_one_of_attributes`, and
   * `required_one_of_attribute_sets` fields.
   *
   * `required_attributes` is a list; `required_one_of_attributes` uses a
   * message which allows a list of lists. In combination, the two fields allow
   * the composition of this expression:
   *
   * ```
   * (required_attributes[0] AND required_attributes[1] AND ...)
   * AND
   * (required_one_of_attributes[0][0] OR required_one_of_attributes[0][1] OR
   * ...)
   * AND
   * (required_one_of_attributes[1][0] OR required_one_of_attributes[1][1] OR
   * ...)
   * ```
   *
   * Restricts the search to only those vehicles with the specified attributes.
   * This field is a conjunction/AND operation. A max of 50 required_attributes
   * is allowed. This matches the maximum number of attributes allowed on a
   * vehicle.
   * </pre>
   *
   * <code>repeated .maps.fleetengine.v1.VehicleAttribute required_attributes = 12;</code>
   */
  int getRequiredAttributesCount();
  /**
   *
   *
   * <pre>
   * Callers can form complex logical operations using any combination of the
   * `required_attributes`, `required_one_of_attributes`, and
   * `required_one_of_attribute_sets` fields.
   *
   * `required_attributes` is a list; `required_one_of_attributes` uses a
   * message which allows a list of lists. In combination, the two fields allow
   * the composition of this expression:
   *
   * ```
   * (required_attributes[0] AND required_attributes[1] AND ...)
   * AND
   * (required_one_of_attributes[0][0] OR required_one_of_attributes[0][1] OR
   * ...)
   * AND
   * (required_one_of_attributes[1][0] OR required_one_of_attributes[1][1] OR
   * ...)
   * ```
   *
   * Restricts the search to only those vehicles with the specified attributes.
   * This field is a conjunction/AND operation. A max of 50 required_attributes
   * is allowed. This matches the maximum number of attributes allowed on a
   * vehicle.
   * </pre>
   *
   * <code>repeated .maps.fleetengine.v1.VehicleAttribute required_attributes = 12;</code>
   */
  java.util.List<? extends com.google.maps.fleetengine.v1.VehicleAttributeOrBuilder>
      getRequiredAttributesOrBuilderList();
  /**
   *
   *
   * <pre>
   * Callers can form complex logical operations using any combination of the
   * `required_attributes`, `required_one_of_attributes`, and
   * `required_one_of_attribute_sets` fields.
   *
   * `required_attributes` is a list; `required_one_of_attributes` uses a
   * message which allows a list of lists. In combination, the two fields allow
   * the composition of this expression:
   *
   * ```
   * (required_attributes[0] AND required_attributes[1] AND ...)
   * AND
   * (required_one_of_attributes[0][0] OR required_one_of_attributes[0][1] OR
   * ...)
   * AND
   * (required_one_of_attributes[1][0] OR required_one_of_attributes[1][1] OR
   * ...)
   * ```
   *
   * Restricts the search to only those vehicles with the specified attributes.
   * This field is a conjunction/AND operation. A max of 50 required_attributes
   * is allowed. This matches the maximum number of attributes allowed on a
   * vehicle.
   * </pre>
   *
   * <code>repeated .maps.fleetengine.v1.VehicleAttribute required_attributes = 12;</code>
   */
  com.google.maps.fleetengine.v1.VehicleAttributeOrBuilder getRequiredAttributesOrBuilder(
      int index);

  /**
   *
   *
   * <pre>
   * Restricts the search to only those vehicles with at least one of
   * the specified attributes in each `VehicleAttributeList`. Within each
   * list, a vehicle must match at least one of the attributes. This field is an
   * inclusive disjunction/OR operation in each `VehicleAttributeList` and a
   * conjunction/AND operation across the collection of `VehicleAttributeList`.
   * </pre>
   *
   * <code>repeated .maps.fleetengine.v1.VehicleAttributeList required_one_of_attributes = 15;
   * </code>
   */
  java.util.List<com.google.maps.fleetengine.v1.VehicleAttributeList>
      getRequiredOneOfAttributesList();
  /**
   *
   *
   * <pre>
   * Restricts the search to only those vehicles with at least one of
   * the specified attributes in each `VehicleAttributeList`. Within each
   * list, a vehicle must match at least one of the attributes. This field is an
   * inclusive disjunction/OR operation in each `VehicleAttributeList` and a
   * conjunction/AND operation across the collection of `VehicleAttributeList`.
   * </pre>
   *
   * <code>repeated .maps.fleetengine.v1.VehicleAttributeList required_one_of_attributes = 15;
   * </code>
   */
  com.google.maps.fleetengine.v1.VehicleAttributeList getRequiredOneOfAttributes(int index);
  /**
   *
   *
   * <pre>
   * Restricts the search to only those vehicles with at least one of
   * the specified attributes in each `VehicleAttributeList`. Within each
   * list, a vehicle must match at least one of the attributes. This field is an
   * inclusive disjunction/OR operation in each `VehicleAttributeList` and a
   * conjunction/AND operation across the collection of `VehicleAttributeList`.
   * </pre>
   *
   * <code>repeated .maps.fleetengine.v1.VehicleAttributeList required_one_of_attributes = 15;
   * </code>
   */
  int getRequiredOneOfAttributesCount();
  /**
   *
   *
   * <pre>
   * Restricts the search to only those vehicles with at least one of
   * the specified attributes in each `VehicleAttributeList`. Within each
   * list, a vehicle must match at least one of the attributes. This field is an
   * inclusive disjunction/OR operation in each `VehicleAttributeList` and a
   * conjunction/AND operation across the collection of `VehicleAttributeList`.
   * </pre>
   *
   * <code>repeated .maps.fleetengine.v1.VehicleAttributeList required_one_of_attributes = 15;
   * </code>
   */
  java.util.List<? extends com.google.maps.fleetengine.v1.VehicleAttributeListOrBuilder>
      getRequiredOneOfAttributesOrBuilderList();
  /**
   *
   *
   * <pre>
   * Restricts the search to only those vehicles with at least one of
   * the specified attributes in each `VehicleAttributeList`. Within each
   * list, a vehicle must match at least one of the attributes. This field is an
   * inclusive disjunction/OR operation in each `VehicleAttributeList` and a
   * conjunction/AND operation across the collection of `VehicleAttributeList`.
   * </pre>
   *
   * <code>repeated .maps.fleetengine.v1.VehicleAttributeList required_one_of_attributes = 15;
   * </code>
   */
  com.google.maps.fleetengine.v1.VehicleAttributeListOrBuilder getRequiredOneOfAttributesOrBuilder(
      int index);

  /**
   *
   *
   * <pre>
   * `required_one_of_attribute_sets` provides additional functionality.
   *
   * Similar to `required_one_of_attributes`, `required_one_of_attribute_sets`
   * uses a message which allows a list of lists, allowing expressions such as
   * this one:
   *
   * ```
   * (required_attributes[0] AND required_attributes[1] AND ...)
   * AND
   * (
   *   (required_one_of_attribute_sets[0][0] AND
   *   required_one_of_attribute_sets[0][1] AND
   *   ...)
   *   OR
   *   (required_one_of_attribute_sets[1][0] AND
   *   required_one_of_attribute_sets[1][1] AND
   *   ...)
   * )
   * ```
   *
   * Restricts the search to only those vehicles with all the attributes in a
   * `VehicleAttributeList`. Within each list, a
   * vehicle must match all of the attributes. This field is a conjunction/AND
   * operation in each `VehicleAttributeList` and inclusive disjunction/OR
   * operation across the collection of `VehicleAttributeList`.
   * </pre>
   *
   * <code>repeated .maps.fleetengine.v1.VehicleAttributeList required_one_of_attribute_sets = 20;
   * </code>
   */
  java.util.List<com.google.maps.fleetengine.v1.VehicleAttributeList>
      getRequiredOneOfAttributeSetsList();
  /**
   *
   *
   * <pre>
   * `required_one_of_attribute_sets` provides additional functionality.
   *
   * Similar to `required_one_of_attributes`, `required_one_of_attribute_sets`
   * uses a message which allows a list of lists, allowing expressions such as
   * this one:
   *
   * ```
   * (required_attributes[0] AND required_attributes[1] AND ...)
   * AND
   * (
   *   (required_one_of_attribute_sets[0][0] AND
   *   required_one_of_attribute_sets[0][1] AND
   *   ...)
   *   OR
   *   (required_one_of_attribute_sets[1][0] AND
   *   required_one_of_attribute_sets[1][1] AND
   *   ...)
   * )
   * ```
   *
   * Restricts the search to only those vehicles with all the attributes in a
   * `VehicleAttributeList`. Within each list, a
   * vehicle must match all of the attributes. This field is a conjunction/AND
   * operation in each `VehicleAttributeList` and inclusive disjunction/OR
   * operation across the collection of `VehicleAttributeList`.
   * </pre>
   *
   * <code>repeated .maps.fleetengine.v1.VehicleAttributeList required_one_of_attribute_sets = 20;
   * </code>
   */
  com.google.maps.fleetengine.v1.VehicleAttributeList getRequiredOneOfAttributeSets(int index);
  /**
   *
   *
   * <pre>
   * `required_one_of_attribute_sets` provides additional functionality.
   *
   * Similar to `required_one_of_attributes`, `required_one_of_attribute_sets`
   * uses a message which allows a list of lists, allowing expressions such as
   * this one:
   *
   * ```
   * (required_attributes[0] AND required_attributes[1] AND ...)
   * AND
   * (
   *   (required_one_of_attribute_sets[0][0] AND
   *   required_one_of_attribute_sets[0][1] AND
   *   ...)
   *   OR
   *   (required_one_of_attribute_sets[1][0] AND
   *   required_one_of_attribute_sets[1][1] AND
   *   ...)
   * )
   * ```
   *
   * Restricts the search to only those vehicles with all the attributes in a
   * `VehicleAttributeList`. Within each list, a
   * vehicle must match all of the attributes. This field is a conjunction/AND
   * operation in each `VehicleAttributeList` and inclusive disjunction/OR
   * operation across the collection of `VehicleAttributeList`.
   * </pre>
   *
   * <code>repeated .maps.fleetengine.v1.VehicleAttributeList required_one_of_attribute_sets = 20;
   * </code>
   */
  int getRequiredOneOfAttributeSetsCount();
  /**
   *
   *
   * <pre>
   * `required_one_of_attribute_sets` provides additional functionality.
   *
   * Similar to `required_one_of_attributes`, `required_one_of_attribute_sets`
   * uses a message which allows a list of lists, allowing expressions such as
   * this one:
   *
   * ```
   * (required_attributes[0] AND required_attributes[1] AND ...)
   * AND
   * (
   *   (required_one_of_attribute_sets[0][0] AND
   *   required_one_of_attribute_sets[0][1] AND
   *   ...)
   *   OR
   *   (required_one_of_attribute_sets[1][0] AND
   *   required_one_of_attribute_sets[1][1] AND
   *   ...)
   * )
   * ```
   *
   * Restricts the search to only those vehicles with all the attributes in a
   * `VehicleAttributeList`. Within each list, a
   * vehicle must match all of the attributes. This field is a conjunction/AND
   * operation in each `VehicleAttributeList` and inclusive disjunction/OR
   * operation across the collection of `VehicleAttributeList`.
   * </pre>
   *
   * <code>repeated .maps.fleetengine.v1.VehicleAttributeList required_one_of_attribute_sets = 20;
   * </code>
   */
  java.util.List<? extends com.google.maps.fleetengine.v1.VehicleAttributeListOrBuilder>
      getRequiredOneOfAttributeSetsOrBuilderList();
  /**
   *
   *
   * <pre>
   * `required_one_of_attribute_sets` provides additional functionality.
   *
   * Similar to `required_one_of_attributes`, `required_one_of_attribute_sets`
   * uses a message which allows a list of lists, allowing expressions such as
   * this one:
   *
   * ```
   * (required_attributes[0] AND required_attributes[1] AND ...)
   * AND
   * (
   *   (required_one_of_attribute_sets[0][0] AND
   *   required_one_of_attribute_sets[0][1] AND
   *   ...)
   *   OR
   *   (required_one_of_attribute_sets[1][0] AND
   *   required_one_of_attribute_sets[1][1] AND
   *   ...)
   * )
   * ```
   *
   * Restricts the search to only those vehicles with all the attributes in a
   * `VehicleAttributeList`. Within each list, a
   * vehicle must match all of the attributes. This field is a conjunction/AND
   * operation in each `VehicleAttributeList` and inclusive disjunction/OR
   * operation across the collection of `VehicleAttributeList`.
   * </pre>
   *
   * <code>repeated .maps.fleetengine.v1.VehicleAttributeList required_one_of_attribute_sets = 20;
   * </code>
   */
  com.google.maps.fleetengine.v1.VehicleAttributeListOrBuilder
      getRequiredOneOfAttributeSetsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Required. Specifies the desired ordering criterion for results.
   * </pre>
   *
   * <code>
   * .maps.fleetengine.v1.SearchVehiclesRequest.VehicleMatchOrder order_by = 13 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The enum numeric value on the wire for orderBy.
   */
  int getOrderByValue();
  /**
   *
   *
   * <pre>
   * Required. Specifies the desired ordering criterion for results.
   * </pre>
   *
   * <code>
   * .maps.fleetengine.v1.SearchVehiclesRequest.VehicleMatchOrder order_by = 13 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The orderBy.
   */
  com.google.maps.fleetengine.v1.SearchVehiclesRequest.VehicleMatchOrder getOrderBy();

  /**
   *
   *
   * <pre>
   * This indicates if vehicles with a single active trip are eligible for this
   * search. This field is only used when `current_trips_present` is
   * unspecified. When `current_trips_present` is unspecified  and  this field
   * is `false`, vehicles with assigned trips are excluded from the search
   * results. When `current_trips_present` is unspecified and this field is
   * `true`, search results can include vehicles with one active trip that has a
   * status of `ENROUTE_TO_DROPOFF`. When `current_trips_present` is specified,
   * this field cannot be set to true.
   *
   * The default value is `false`.
   * </pre>
   *
   * <code>bool include_back_to_back = 18;</code>
   *
   * @return The includeBackToBack.
   */
  boolean getIncludeBackToBack();

  /**
   *
   *
   * <pre>
   * Indicates the trip associated with this `SearchVehicleRequest`.
   * </pre>
   *
   * <code>string trip_id = 19;</code>
   *
   * @return The tripId.
   */
  java.lang.String getTripId();
  /**
   *
   *
   * <pre>
   * Indicates the trip associated with this `SearchVehicleRequest`.
   * </pre>
   *
   * <code>string trip_id = 19;</code>
   *
   * @return The bytes for tripId.
   */
  com.google.protobuf.ByteString getTripIdBytes();

  /**
   *
   *
   * <pre>
   * This indicates if vehicles with active trips are eligible for this search.
   * This must be set to something other than
   * `CURRENT_TRIPS_PRESENT_UNSPECIFIED` if `trip_type` includes `SHARED`.
   * </pre>
   *
   * <code>
   * .maps.fleetengine.v1.SearchVehiclesRequest.CurrentTripsPresent current_trips_present = 21;
   * </code>
   *
   * @return The enum numeric value on the wire for currentTripsPresent.
   */
  int getCurrentTripsPresentValue();
  /**
   *
   *
   * <pre>
   * This indicates if vehicles with active trips are eligible for this search.
   * This must be set to something other than
   * `CURRENT_TRIPS_PRESENT_UNSPECIFIED` if `trip_type` includes `SHARED`.
   * </pre>
   *
   * <code>
   * .maps.fleetengine.v1.SearchVehiclesRequest.CurrentTripsPresent current_trips_present = 21;
   * </code>
   *
   * @return The currentTripsPresent.
   */
  com.google.maps.fleetengine.v1.SearchVehiclesRequest.CurrentTripsPresent getCurrentTripsPresent();

  /**
   *
   *
   * <pre>
   * Optional. A filter query to apply when searching vehicles. See
   * http://aip.dev/160 for examples of the filter syntax.
   *
   * This field is designed to replace the `required_attributes`,
   * `required_one_of_attributes`, and `required_one_of_attributes_sets` fields.
   * If a non-empty value is specified here, the following fields must be empty:
   * `required_attributes`, `required_one_of_attributes`, and
   * `required_one_of_attributes_sets`.
   *
   * This filter functions as an AND clause with other constraints,
   * such as `minimum_capacity` or `vehicle_types`.
   *
   * Note that the only queries supported are on vehicle attributes (for
   * example, `attributes.&lt;key&gt; = &lt;value&gt;` or `attributes.&lt;key1&gt; = &lt;value1&gt; AND
   * attributes.&lt;key2&gt; = &lt;value2&gt;`). The maximum number of restrictions allowed
   * in a filter query is 50.
   *
   * Also, all attributes are stored as strings, so the only supported
   * comparisons against attributes are string comparisons. In order to compare
   * against number or boolean values, the values must be explicitly quoted to
   * be treated as strings (for example, `attributes.&lt;key&gt; = "10"` or
   * `attributes.&lt;key&gt; = "true"`).
   * </pre>
   *
   * <code>string filter = 22 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The filter.
   */
  java.lang.String getFilter();
  /**
   *
   *
   * <pre>
   * Optional. A filter query to apply when searching vehicles. See
   * http://aip.dev/160 for examples of the filter syntax.
   *
   * This field is designed to replace the `required_attributes`,
   * `required_one_of_attributes`, and `required_one_of_attributes_sets` fields.
   * If a non-empty value is specified here, the following fields must be empty:
   * `required_attributes`, `required_one_of_attributes`, and
   * `required_one_of_attributes_sets`.
   *
   * This filter functions as an AND clause with other constraints,
   * such as `minimum_capacity` or `vehicle_types`.
   *
   * Note that the only queries supported are on vehicle attributes (for
   * example, `attributes.&lt;key&gt; = &lt;value&gt;` or `attributes.&lt;key1&gt; = &lt;value1&gt; AND
   * attributes.&lt;key2&gt; = &lt;value2&gt;`). The maximum number of restrictions allowed
   * in a filter query is 50.
   *
   * Also, all attributes are stored as strings, so the only supported
   * comparisons against attributes are string comparisons. In order to compare
   * against number or boolean values, the values must be explicitly quoted to
   * be treated as strings (for example, `attributes.&lt;key&gt; = "10"` or
   * `attributes.&lt;key&gt; = "true"`).
   * </pre>
   *
   * <code>string filter = 22 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for filter.
   */
  com.google.protobuf.ByteString getFilterBytes();
}
