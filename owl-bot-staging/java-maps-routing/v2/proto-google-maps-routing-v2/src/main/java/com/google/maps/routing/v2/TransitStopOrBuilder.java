// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/maps/routing/v2/transit.proto

package com.google.maps.routing.v2;

public interface TransitStopOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.maps.routing.v2.TransitStop)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The name of the transit stop.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * The name of the transit stop.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * The location of the stop expressed in latitude/longitude coordinates.
   * </pre>
   *
   * <code>.google.maps.routing.v2.Location location = 2;</code>
   * @return Whether the location field is set.
   */
  boolean hasLocation();
  /**
   * <pre>
   * The location of the stop expressed in latitude/longitude coordinates.
   * </pre>
   *
   * <code>.google.maps.routing.v2.Location location = 2;</code>
   * @return The location.
   */
  com.google.maps.routing.v2.Location getLocation();
  /**
   * <pre>
   * The location of the stop expressed in latitude/longitude coordinates.
   * </pre>
   *
   * <code>.google.maps.routing.v2.Location location = 2;</code>
   */
  com.google.maps.routing.v2.LocationOrBuilder getLocationOrBuilder();
}
