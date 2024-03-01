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
// source: google/cloud/edgecontainer/v1/resources.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.edgecontainer.v1;

public interface LocationMetadataOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.edgecontainer.v1.LocationMetadata)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The set of available Google Distributed Cloud Edge zones in the location.
   * The map is keyed by the lowercase ID of each zone.
   * </pre>
   *
   * <code>map&lt;string, .google.cloud.edgecontainer.v1.ZoneMetadata&gt; available_zones = 1;
   * </code>
   */
  int getAvailableZonesCount();
  /**
   *
   *
   * <pre>
   * The set of available Google Distributed Cloud Edge zones in the location.
   * The map is keyed by the lowercase ID of each zone.
   * </pre>
   *
   * <code>map&lt;string, .google.cloud.edgecontainer.v1.ZoneMetadata&gt; available_zones = 1;
   * </code>
   */
  boolean containsAvailableZones(java.lang.String key);
  /** Use {@link #getAvailableZonesMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, com.google.cloud.edgecontainer.v1.ZoneMetadata>
      getAvailableZones();
  /**
   *
   *
   * <pre>
   * The set of available Google Distributed Cloud Edge zones in the location.
   * The map is keyed by the lowercase ID of each zone.
   * </pre>
   *
   * <code>map&lt;string, .google.cloud.edgecontainer.v1.ZoneMetadata&gt; available_zones = 1;
   * </code>
   */
  java.util.Map<java.lang.String, com.google.cloud.edgecontainer.v1.ZoneMetadata>
      getAvailableZonesMap();
  /**
   *
   *
   * <pre>
   * The set of available Google Distributed Cloud Edge zones in the location.
   * The map is keyed by the lowercase ID of each zone.
   * </pre>
   *
   * <code>map&lt;string, .google.cloud.edgecontainer.v1.ZoneMetadata&gt; available_zones = 1;
   * </code>
   */
  /* nullable */
  com.google.cloud.edgecontainer.v1.ZoneMetadata getAvailableZonesOrDefault(
      java.lang.String key,
      /* nullable */
      com.google.cloud.edgecontainer.v1.ZoneMetadata defaultValue);
  /**
   *
   *
   * <pre>
   * The set of available Google Distributed Cloud Edge zones in the location.
   * The map is keyed by the lowercase ID of each zone.
   * </pre>
   *
   * <code>map&lt;string, .google.cloud.edgecontainer.v1.ZoneMetadata&gt; available_zones = 1;
   * </code>
   */
  com.google.cloud.edgecontainer.v1.ZoneMetadata getAvailableZonesOrThrow(java.lang.String key);
}
