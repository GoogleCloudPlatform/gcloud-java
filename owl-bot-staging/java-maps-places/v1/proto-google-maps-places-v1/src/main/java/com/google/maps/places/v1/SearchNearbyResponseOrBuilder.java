// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/maps/places/v1/places_service.proto

package com.google.maps.places.v1;

public interface SearchNearbyResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.maps.places.v1.SearchNearbyResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * A list of interesting places that meets user's requirements like places
   * types, number of places and specific location restriction.
   * </pre>
   *
   * <code>repeated .google.maps.places.v1.Place places = 1;</code>
   */
  java.util.List<com.google.maps.places.v1.Place> 
      getPlacesList();
  /**
   * <pre>
   * A list of interesting places that meets user's requirements like places
   * types, number of places and specific location restriction.
   * </pre>
   *
   * <code>repeated .google.maps.places.v1.Place places = 1;</code>
   */
  com.google.maps.places.v1.Place getPlaces(int index);
  /**
   * <pre>
   * A list of interesting places that meets user's requirements like places
   * types, number of places and specific location restriction.
   * </pre>
   *
   * <code>repeated .google.maps.places.v1.Place places = 1;</code>
   */
  int getPlacesCount();
  /**
   * <pre>
   * A list of interesting places that meets user's requirements like places
   * types, number of places and specific location restriction.
   * </pre>
   *
   * <code>repeated .google.maps.places.v1.Place places = 1;</code>
   */
  java.util.List<? extends com.google.maps.places.v1.PlaceOrBuilder> 
      getPlacesOrBuilderList();
  /**
   * <pre>
   * A list of interesting places that meets user's requirements like places
   * types, number of places and specific location restriction.
   * </pre>
   *
   * <code>repeated .google.maps.places.v1.Place places = 1;</code>
   */
  com.google.maps.places.v1.PlaceOrBuilder getPlacesOrBuilder(
      int index);
}
