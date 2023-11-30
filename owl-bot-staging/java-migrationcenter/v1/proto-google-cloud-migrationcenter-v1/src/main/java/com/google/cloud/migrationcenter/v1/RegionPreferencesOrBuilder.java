// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/migrationcenter/v1/migrationcenter.proto

package com.google.cloud.migrationcenter.v1;

public interface RegionPreferencesOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.migrationcenter.v1.RegionPreferences)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * A list of preferred regions,
   * ordered by the most preferred region first.
   * Set only valid Google Cloud region names.
   * See https://cloud.google.com/compute/docs/regions-zones
   * for available regions.
   * </pre>
   *
   * <code>repeated string preferred_regions = 1;</code>
   * @return A list containing the preferredRegions.
   */
  java.util.List<java.lang.String>
      getPreferredRegionsList();
  /**
   * <pre>
   * A list of preferred regions,
   * ordered by the most preferred region first.
   * Set only valid Google Cloud region names.
   * See https://cloud.google.com/compute/docs/regions-zones
   * for available regions.
   * </pre>
   *
   * <code>repeated string preferred_regions = 1;</code>
   * @return The count of preferredRegions.
   */
  int getPreferredRegionsCount();
  /**
   * <pre>
   * A list of preferred regions,
   * ordered by the most preferred region first.
   * Set only valid Google Cloud region names.
   * See https://cloud.google.com/compute/docs/regions-zones
   * for available regions.
   * </pre>
   *
   * <code>repeated string preferred_regions = 1;</code>
   * @param index The index of the element to return.
   * @return The preferredRegions at the given index.
   */
  java.lang.String getPreferredRegions(int index);
  /**
   * <pre>
   * A list of preferred regions,
   * ordered by the most preferred region first.
   * Set only valid Google Cloud region names.
   * See https://cloud.google.com/compute/docs/regions-zones
   * for available regions.
   * </pre>
   *
   * <code>repeated string preferred_regions = 1;</code>
   * @param index The index of the value to return.
   * @return The bytes of the preferredRegions at the given index.
   */
  com.google.protobuf.ByteString
      getPreferredRegionsBytes(int index);
}
