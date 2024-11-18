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
// source: google/maps/fleetengine/v1/vehicles.proto

// Protobuf Java Version: 3.25.5
package com.google.maps.fleetengine.v1;

public interface VisualTrafficReportPolylineRenderingOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:maps.fleetengine.v1.VisualTrafficReportPolylineRendering)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Optional. Road stretches that should be rendered along the polyline.
   * Stretches are guaranteed to not overlap, and do not necessarily span the
   * full route.
   *
   * In the absence of a road stretch to style, the client should apply the
   * default for the route.
   * </pre>
   *
   * <code>
   * repeated .maps.fleetengine.v1.VisualTrafficReportPolylineRendering.RoadStretch road_stretch = 1 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  java.util.List<com.google.maps.fleetengine.v1.VisualTrafficReportPolylineRendering.RoadStretch>
      getRoadStretchList();
  /**
   *
   *
   * <pre>
   * Optional. Road stretches that should be rendered along the polyline.
   * Stretches are guaranteed to not overlap, and do not necessarily span the
   * full route.
   *
   * In the absence of a road stretch to style, the client should apply the
   * default for the route.
   * </pre>
   *
   * <code>
   * repeated .maps.fleetengine.v1.VisualTrafficReportPolylineRendering.RoadStretch road_stretch = 1 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.maps.fleetengine.v1.VisualTrafficReportPolylineRendering.RoadStretch getRoadStretch(
      int index);
  /**
   *
   *
   * <pre>
   * Optional. Road stretches that should be rendered along the polyline.
   * Stretches are guaranteed to not overlap, and do not necessarily span the
   * full route.
   *
   * In the absence of a road stretch to style, the client should apply the
   * default for the route.
   * </pre>
   *
   * <code>
   * repeated .maps.fleetengine.v1.VisualTrafficReportPolylineRendering.RoadStretch road_stretch = 1 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  int getRoadStretchCount();
  /**
   *
   *
   * <pre>
   * Optional. Road stretches that should be rendered along the polyline.
   * Stretches are guaranteed to not overlap, and do not necessarily span the
   * full route.
   *
   * In the absence of a road stretch to style, the client should apply the
   * default for the route.
   * </pre>
   *
   * <code>
   * repeated .maps.fleetengine.v1.VisualTrafficReportPolylineRendering.RoadStretch road_stretch = 1 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  java.util.List<
          ? extends
              com.google.maps.fleetengine.v1.VisualTrafficReportPolylineRendering
                  .RoadStretchOrBuilder>
      getRoadStretchOrBuilderList();
  /**
   *
   *
   * <pre>
   * Optional. Road stretches that should be rendered along the polyline.
   * Stretches are guaranteed to not overlap, and do not necessarily span the
   * full route.
   *
   * In the absence of a road stretch to style, the client should apply the
   * default for the route.
   * </pre>
   *
   * <code>
   * repeated .maps.fleetengine.v1.VisualTrafficReportPolylineRendering.RoadStretch road_stretch = 1 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.maps.fleetengine.v1.VisualTrafficReportPolylineRendering.RoadStretchOrBuilder
      getRoadStretchOrBuilder(int index);
}
