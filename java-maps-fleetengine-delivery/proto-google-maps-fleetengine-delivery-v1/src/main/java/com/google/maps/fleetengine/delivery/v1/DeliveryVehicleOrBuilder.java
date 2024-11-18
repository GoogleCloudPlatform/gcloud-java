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
// source: google/maps/fleetengine/delivery/v1/delivery_vehicles.proto

// Protobuf Java Version: 3.25.5
package com.google.maps.fleetengine.delivery.v1;

public interface DeliveryVehicleOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:maps.fleetengine.delivery.v1.DeliveryVehicle)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The unique name of this Delivery Vehicle.
   * The format is `providers/{provider}/deliveryVehicles/{vehicle}`.
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * The unique name of this Delivery Vehicle.
   * The format is `providers/{provider}/deliveryVehicles/{vehicle}`.
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * The last reported location of the Delivery Vehicle.
   * </pre>
   *
   * <code>.maps.fleetengine.delivery.v1.DeliveryVehicleLocation last_location = 2;</code>
   *
   * @return Whether the lastLocation field is set.
   */
  boolean hasLastLocation();
  /**
   *
   *
   * <pre>
   * The last reported location of the Delivery Vehicle.
   * </pre>
   *
   * <code>.maps.fleetengine.delivery.v1.DeliveryVehicleLocation last_location = 2;</code>
   *
   * @return The lastLocation.
   */
  com.google.maps.fleetengine.delivery.v1.DeliveryVehicleLocation getLastLocation();
  /**
   *
   *
   * <pre>
   * The last reported location of the Delivery Vehicle.
   * </pre>
   *
   * <code>.maps.fleetengine.delivery.v1.DeliveryVehicleLocation last_location = 2;</code>
   */
  com.google.maps.fleetengine.delivery.v1.DeliveryVehicleLocationOrBuilder
      getLastLocationOrBuilder();

  /**
   *
   *
   * <pre>
   * The Delivery Vehicle's navigation status.
   * </pre>
   *
   * <code>.maps.fleetengine.delivery.v1.DeliveryVehicleNavigationStatus navigation_status = 3;
   * </code>
   *
   * @return The enum numeric value on the wire for navigationStatus.
   */
  int getNavigationStatusValue();
  /**
   *
   *
   * <pre>
   * The Delivery Vehicle's navigation status.
   * </pre>
   *
   * <code>.maps.fleetengine.delivery.v1.DeliveryVehicleNavigationStatus navigation_status = 3;
   * </code>
   *
   * @return The navigationStatus.
   */
  com.google.maps.fleetengine.delivery.v1.DeliveryVehicleNavigationStatus getNavigationStatus();

  /**
   *
   *
   * <pre>
   * The encoded polyline specifying the route that the navigation recommends
   * taking to the next waypoint. Your driver app updates this when a
   * stop is reached or passed, and when the navigation reroutes. These
   * `LatLng`s are returned in
   * `Task.journey_sharing_info.remaining_vehicle_journey_segments[0].path`
   * (gRPC) or `Task.journeySharingInfo.remainingVehicleJourneySegments[0].path`
   * (REST) for all active Tasks assigned to the Vehicle.
   *
   * There are a few cases where this field might not be used to populate
   * `Task.journey_sharing_info.remaining_vehicle_journey_segments[0].path`
   * (gRPC) or `Task.journeySharingInfo.remainingVehicleJourneySegments[0].path`
   * (REST):
   *
   * * The endpoint of the `current_route_segment` does not match
   * `DeliveryVehicle.remaining_vehicle_journey_segments[0].stop` (gRPC) or
   * `DeliveryVehicle.remainingVehicleJourneySegments[0].stop` (REST).
   *
   * * The driver app has not updated its location recently, so the last
   * updated value for this field might be stale.
   *
   * * The driver app has recently updated its location, but the
   * `current_route_segment` is stale, and points to a previous vehicle stop.
   *
   * In these cases, Fleet Engine populates this field with a route from the
   * most recently passed VehicleStop to the upcoming VehicleStop to ensure that
   * the consumer of this field has the best available information on the
   * current path of the Delivery Vehicle.
   * </pre>
   *
   * <code>bytes current_route_segment = 4;</code>
   *
   * @return The currentRouteSegment.
   */
  com.google.protobuf.ByteString getCurrentRouteSegment();

  /**
   *
   *
   * <pre>
   * The location where the `current_route_segment` ends. This is not currently
   * populated by the driver app, but you can supply it on
   * `UpdateDeliveryVehicle` calls. It is either the `LatLng` from the upcoming
   * vehicle stop, or the last `LatLng` of the `current_route_segment`. Fleet
   * Engine will then do its best to interpolate to an actual `VehicleStop`.
   *
   * This field is ignored in `UpdateDeliveryVehicle` calls if the
   * `current_route_segment` field is empty.
   * </pre>
   *
   * <code>.google.type.LatLng current_route_segment_end_point = 5;</code>
   *
   * @return Whether the currentRouteSegmentEndPoint field is set.
   */
  boolean hasCurrentRouteSegmentEndPoint();
  /**
   *
   *
   * <pre>
   * The location where the `current_route_segment` ends. This is not currently
   * populated by the driver app, but you can supply it on
   * `UpdateDeliveryVehicle` calls. It is either the `LatLng` from the upcoming
   * vehicle stop, or the last `LatLng` of the `current_route_segment`. Fleet
   * Engine will then do its best to interpolate to an actual `VehicleStop`.
   *
   * This field is ignored in `UpdateDeliveryVehicle` calls if the
   * `current_route_segment` field is empty.
   * </pre>
   *
   * <code>.google.type.LatLng current_route_segment_end_point = 5;</code>
   *
   * @return The currentRouteSegmentEndPoint.
   */
  com.google.type.LatLng getCurrentRouteSegmentEndPoint();
  /**
   *
   *
   * <pre>
   * The location where the `current_route_segment` ends. This is not currently
   * populated by the driver app, but you can supply it on
   * `UpdateDeliveryVehicle` calls. It is either the `LatLng` from the upcoming
   * vehicle stop, or the last `LatLng` of the `current_route_segment`. Fleet
   * Engine will then do its best to interpolate to an actual `VehicleStop`.
   *
   * This field is ignored in `UpdateDeliveryVehicle` calls if the
   * `current_route_segment` field is empty.
   * </pre>
   *
   * <code>.google.type.LatLng current_route_segment_end_point = 5;</code>
   */
  com.google.type.LatLngOrBuilder getCurrentRouteSegmentEndPointOrBuilder();

  /**
   *
   *
   * <pre>
   * The remaining driving distance for the `current_route_segment`.
   * The Driver app typically provides this field, but there are some
   * circumstances in which Fleet Engine will override the value sent by the
   * app. For more information, see
   * [DeliveryVehicle.current_route_segment][maps.fleetengine.delivery.v1.DeliveryVehicle.current_route_segment].
   * This field is returned in
   * `Task.remaining_vehicle_journey_segments[0].driving_distance_meters` (gRPC)
   * or `Task.remainingVehicleJourneySegments[0].drivingDistanceMeters` (REST)
   * for all active `Task`s assigned to the Delivery Vehicle.
   *
   * Fleet Engine ignores this field in `UpdateDeliveryVehicleRequest` if the
   * `current_route_segment` field is empty.
   * </pre>
   *
   * <code>.google.protobuf.Int32Value remaining_distance_meters = 6;</code>
   *
   * @return Whether the remainingDistanceMeters field is set.
   */
  boolean hasRemainingDistanceMeters();
  /**
   *
   *
   * <pre>
   * The remaining driving distance for the `current_route_segment`.
   * The Driver app typically provides this field, but there are some
   * circumstances in which Fleet Engine will override the value sent by the
   * app. For more information, see
   * [DeliveryVehicle.current_route_segment][maps.fleetengine.delivery.v1.DeliveryVehicle.current_route_segment].
   * This field is returned in
   * `Task.remaining_vehicle_journey_segments[0].driving_distance_meters` (gRPC)
   * or `Task.remainingVehicleJourneySegments[0].drivingDistanceMeters` (REST)
   * for all active `Task`s assigned to the Delivery Vehicle.
   *
   * Fleet Engine ignores this field in `UpdateDeliveryVehicleRequest` if the
   * `current_route_segment` field is empty.
   * </pre>
   *
   * <code>.google.protobuf.Int32Value remaining_distance_meters = 6;</code>
   *
   * @return The remainingDistanceMeters.
   */
  com.google.protobuf.Int32Value getRemainingDistanceMeters();
  /**
   *
   *
   * <pre>
   * The remaining driving distance for the `current_route_segment`.
   * The Driver app typically provides this field, but there are some
   * circumstances in which Fleet Engine will override the value sent by the
   * app. For more information, see
   * [DeliveryVehicle.current_route_segment][maps.fleetengine.delivery.v1.DeliveryVehicle.current_route_segment].
   * This field is returned in
   * `Task.remaining_vehicle_journey_segments[0].driving_distance_meters` (gRPC)
   * or `Task.remainingVehicleJourneySegments[0].drivingDistanceMeters` (REST)
   * for all active `Task`s assigned to the Delivery Vehicle.
   *
   * Fleet Engine ignores this field in `UpdateDeliveryVehicleRequest` if the
   * `current_route_segment` field is empty.
   * </pre>
   *
   * <code>.google.protobuf.Int32Value remaining_distance_meters = 6;</code>
   */
  com.google.protobuf.Int32ValueOrBuilder getRemainingDistanceMetersOrBuilder();

  /**
   *
   *
   * <pre>
   * The remaining driving time for the `current_route_segment`.
   * The Driver app typically provides this field, but there are some
   * circumstances in which Fleet Engine will override the value sent by the
   * app.  For more information, see
   * [DeliveryVehicle.current_route_segment][maps.fleetengine.delivery.v1.DeliveryVehicle.current_route_segment].
   * This field is returned in
   * `Task.remaining_vehicle_journey_segments[0].driving_duration` (gRPC) or
   * `Task.remainingVehicleJourneySegments[0].drivingDuration` (REST) for all
   * active tasks assigned to the Delivery Vehicle.
   *
   * Fleet Engine ignores this field in `UpdateDeliveryVehicleRequest` if the
   * `current_route_segment` field is empty.
   * </pre>
   *
   * <code>.google.protobuf.Duration remaining_duration = 7;</code>
   *
   * @return Whether the remainingDuration field is set.
   */
  boolean hasRemainingDuration();
  /**
   *
   *
   * <pre>
   * The remaining driving time for the `current_route_segment`.
   * The Driver app typically provides this field, but there are some
   * circumstances in which Fleet Engine will override the value sent by the
   * app.  For more information, see
   * [DeliveryVehicle.current_route_segment][maps.fleetengine.delivery.v1.DeliveryVehicle.current_route_segment].
   * This field is returned in
   * `Task.remaining_vehicle_journey_segments[0].driving_duration` (gRPC) or
   * `Task.remainingVehicleJourneySegments[0].drivingDuration` (REST) for all
   * active tasks assigned to the Delivery Vehicle.
   *
   * Fleet Engine ignores this field in `UpdateDeliveryVehicleRequest` if the
   * `current_route_segment` field is empty.
   * </pre>
   *
   * <code>.google.protobuf.Duration remaining_duration = 7;</code>
   *
   * @return The remainingDuration.
   */
  com.google.protobuf.Duration getRemainingDuration();
  /**
   *
   *
   * <pre>
   * The remaining driving time for the `current_route_segment`.
   * The Driver app typically provides this field, but there are some
   * circumstances in which Fleet Engine will override the value sent by the
   * app.  For more information, see
   * [DeliveryVehicle.current_route_segment][maps.fleetengine.delivery.v1.DeliveryVehicle.current_route_segment].
   * This field is returned in
   * `Task.remaining_vehicle_journey_segments[0].driving_duration` (gRPC) or
   * `Task.remainingVehicleJourneySegments[0].drivingDuration` (REST) for all
   * active tasks assigned to the Delivery Vehicle.
   *
   * Fleet Engine ignores this field in `UpdateDeliveryVehicleRequest` if the
   * `current_route_segment` field is empty.
   * </pre>
   *
   * <code>.google.protobuf.Duration remaining_duration = 7;</code>
   */
  com.google.protobuf.DurationOrBuilder getRemainingDurationOrBuilder();

  /**
   *
   *
   * <pre>
   * The journey segments assigned to this Delivery Vehicle, starting from the
   * Vehicle's most recently reported location. This field won't be populated
   * in the response of `ListDeliveryVehicles`.
   * </pre>
   *
   * <code>
   * repeated .maps.fleetengine.delivery.v1.VehicleJourneySegment remaining_vehicle_journey_segments = 8;
   * </code>
   */
  java.util.List<com.google.maps.fleetengine.delivery.v1.VehicleJourneySegment>
      getRemainingVehicleJourneySegmentsList();
  /**
   *
   *
   * <pre>
   * The journey segments assigned to this Delivery Vehicle, starting from the
   * Vehicle's most recently reported location. This field won't be populated
   * in the response of `ListDeliveryVehicles`.
   * </pre>
   *
   * <code>
   * repeated .maps.fleetengine.delivery.v1.VehicleJourneySegment remaining_vehicle_journey_segments = 8;
   * </code>
   */
  com.google.maps.fleetengine.delivery.v1.VehicleJourneySegment getRemainingVehicleJourneySegments(
      int index);
  /**
   *
   *
   * <pre>
   * The journey segments assigned to this Delivery Vehicle, starting from the
   * Vehicle's most recently reported location. This field won't be populated
   * in the response of `ListDeliveryVehicles`.
   * </pre>
   *
   * <code>
   * repeated .maps.fleetengine.delivery.v1.VehicleJourneySegment remaining_vehicle_journey_segments = 8;
   * </code>
   */
  int getRemainingVehicleJourneySegmentsCount();
  /**
   *
   *
   * <pre>
   * The journey segments assigned to this Delivery Vehicle, starting from the
   * Vehicle's most recently reported location. This field won't be populated
   * in the response of `ListDeliveryVehicles`.
   * </pre>
   *
   * <code>
   * repeated .maps.fleetengine.delivery.v1.VehicleJourneySegment remaining_vehicle_journey_segments = 8;
   * </code>
   */
  java.util.List<? extends com.google.maps.fleetengine.delivery.v1.VehicleJourneySegmentOrBuilder>
      getRemainingVehicleJourneySegmentsOrBuilderList();
  /**
   *
   *
   * <pre>
   * The journey segments assigned to this Delivery Vehicle, starting from the
   * Vehicle's most recently reported location. This field won't be populated
   * in the response of `ListDeliveryVehicles`.
   * </pre>
   *
   * <code>
   * repeated .maps.fleetengine.delivery.v1.VehicleJourneySegment remaining_vehicle_journey_segments = 8;
   * </code>
   */
  com.google.maps.fleetengine.delivery.v1.VehicleJourneySegmentOrBuilder
      getRemainingVehicleJourneySegmentsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * A list of custom Delivery Vehicle attributes. A Delivery Vehicle can have
   * at most 100 attributes, and each attribute must have a unique key.
   * </pre>
   *
   * <code>repeated .maps.fleetengine.delivery.v1.DeliveryVehicleAttribute attributes = 9;</code>
   */
  java.util.List<com.google.maps.fleetengine.delivery.v1.DeliveryVehicleAttribute>
      getAttributesList();
  /**
   *
   *
   * <pre>
   * A list of custom Delivery Vehicle attributes. A Delivery Vehicle can have
   * at most 100 attributes, and each attribute must have a unique key.
   * </pre>
   *
   * <code>repeated .maps.fleetengine.delivery.v1.DeliveryVehicleAttribute attributes = 9;</code>
   */
  com.google.maps.fleetengine.delivery.v1.DeliveryVehicleAttribute getAttributes(int index);
  /**
   *
   *
   * <pre>
   * A list of custom Delivery Vehicle attributes. A Delivery Vehicle can have
   * at most 100 attributes, and each attribute must have a unique key.
   * </pre>
   *
   * <code>repeated .maps.fleetengine.delivery.v1.DeliveryVehicleAttribute attributes = 9;</code>
   */
  int getAttributesCount();
  /**
   *
   *
   * <pre>
   * A list of custom Delivery Vehicle attributes. A Delivery Vehicle can have
   * at most 100 attributes, and each attribute must have a unique key.
   * </pre>
   *
   * <code>repeated .maps.fleetengine.delivery.v1.DeliveryVehicleAttribute attributes = 9;</code>
   */
  java.util.List<
          ? extends com.google.maps.fleetengine.delivery.v1.DeliveryVehicleAttributeOrBuilder>
      getAttributesOrBuilderList();
  /**
   *
   *
   * <pre>
   * A list of custom Delivery Vehicle attributes. A Delivery Vehicle can have
   * at most 100 attributes, and each attribute must have a unique key.
   * </pre>
   *
   * <code>repeated .maps.fleetengine.delivery.v1.DeliveryVehicleAttribute attributes = 9;</code>
   */
  com.google.maps.fleetengine.delivery.v1.DeliveryVehicleAttributeOrBuilder getAttributesOrBuilder(
      int index);

  /**
   *
   *
   * <pre>
   * The type of this delivery vehicle. If unset, this will default to `AUTO`.
   * </pre>
   *
   * <code>.maps.fleetengine.delivery.v1.DeliveryVehicle.DeliveryVehicleType type = 10;</code>
   *
   * @return The enum numeric value on the wire for type.
   */
  int getTypeValue();
  /**
   *
   *
   * <pre>
   * The type of this delivery vehicle. If unset, this will default to `AUTO`.
   * </pre>
   *
   * <code>.maps.fleetengine.delivery.v1.DeliveryVehicle.DeliveryVehicleType type = 10;</code>
   *
   * @return The type.
   */
  com.google.maps.fleetengine.delivery.v1.DeliveryVehicle.DeliveryVehicleType getType();
}
