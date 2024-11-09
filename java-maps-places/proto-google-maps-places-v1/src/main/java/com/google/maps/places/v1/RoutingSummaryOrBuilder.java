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
// source: google/maps/places/v1/routing_summary.proto

// Protobuf Java Version: 3.25.5
package com.google.maps.places.v1;

public interface RoutingSummaryOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.maps.places.v1.RoutingSummary)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The legs of the trip.
   *
   * When you calculate travel duration and distance from a set origin, `legs`
   * contains a single leg containing the duration and distance from the origin
   * to the destination.  When you do a search along route, `legs` contains two
   * legs: one from the origin to place, and one from the place to the
   * destination.
   * </pre>
   *
   * <code>repeated .google.maps.places.v1.RoutingSummary.Leg legs = 1;</code>
   */
  java.util.List<com.google.maps.places.v1.RoutingSummary.Leg> getLegsList();
  /**
   *
   *
   * <pre>
   * The legs of the trip.
   *
   * When you calculate travel duration and distance from a set origin, `legs`
   * contains a single leg containing the duration and distance from the origin
   * to the destination.  When you do a search along route, `legs` contains two
   * legs: one from the origin to place, and one from the place to the
   * destination.
   * </pre>
   *
   * <code>repeated .google.maps.places.v1.RoutingSummary.Leg legs = 1;</code>
   */
  com.google.maps.places.v1.RoutingSummary.Leg getLegs(int index);
  /**
   *
   *
   * <pre>
   * The legs of the trip.
   *
   * When you calculate travel duration and distance from a set origin, `legs`
   * contains a single leg containing the duration and distance from the origin
   * to the destination.  When you do a search along route, `legs` contains two
   * legs: one from the origin to place, and one from the place to the
   * destination.
   * </pre>
   *
   * <code>repeated .google.maps.places.v1.RoutingSummary.Leg legs = 1;</code>
   */
  int getLegsCount();
  /**
   *
   *
   * <pre>
   * The legs of the trip.
   *
   * When you calculate travel duration and distance from a set origin, `legs`
   * contains a single leg containing the duration and distance from the origin
   * to the destination.  When you do a search along route, `legs` contains two
   * legs: one from the origin to place, and one from the place to the
   * destination.
   * </pre>
   *
   * <code>repeated .google.maps.places.v1.RoutingSummary.Leg legs = 1;</code>
   */
  java.util.List<? extends com.google.maps.places.v1.RoutingSummary.LegOrBuilder>
      getLegsOrBuilderList();
  /**
   *
   *
   * <pre>
   * The legs of the trip.
   *
   * When you calculate travel duration and distance from a set origin, `legs`
   * contains a single leg containing the duration and distance from the origin
   * to the destination.  When you do a search along route, `legs` contains two
   * legs: one from the origin to place, and one from the place to the
   * destination.
   * </pre>
   *
   * <code>repeated .google.maps.places.v1.RoutingSummary.Leg legs = 1;</code>
   */
  com.google.maps.places.v1.RoutingSummary.LegOrBuilder getLegsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * A link to show directions on Google Maps using the waypoints from the given
   * routing summary. The route generated by this link is not guaranteed to be
   * the same as the route used to generate the routing summary.
   * The link uses information provided in the request, from fields including
   * `routingParameters` and `searchAlongRouteParameters` when applicable, to
   * generate the directions link.
   * </pre>
   *
   * <code>string directions_uri = 2;</code>
   *
   * @return The directionsUri.
   */
  java.lang.String getDirectionsUri();
  /**
   *
   *
   * <pre>
   * A link to show directions on Google Maps using the waypoints from the given
   * routing summary. The route generated by this link is not guaranteed to be
   * the same as the route used to generate the routing summary.
   * The link uses information provided in the request, from fields including
   * `routingParameters` and `searchAlongRouteParameters` when applicable, to
   * generate the directions link.
   * </pre>
   *
   * <code>string directions_uri = 2;</code>
   *
   * @return The bytes for directionsUri.
   */
  com.google.protobuf.ByteString getDirectionsUriBytes();
}
