// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/functions/v2alpha/functions.proto

package com.google.cloud.functions.v2alpha;

public interface LocationMetadataOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.functions.v2alpha.LocationMetadata)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The Cloud Function environments this location supports.
   * </pre>
   *
   * <code>repeated .google.cloud.functions.v2alpha.Environment environments = 1;</code>
   * @return A list containing the environments.
   */
  java.util.List<com.google.cloud.functions.v2alpha.Environment> getEnvironmentsList();
  /**
   * <pre>
   * The Cloud Function environments this location supports.
   * </pre>
   *
   * <code>repeated .google.cloud.functions.v2alpha.Environment environments = 1;</code>
   * @return The count of environments.
   */
  int getEnvironmentsCount();
  /**
   * <pre>
   * The Cloud Function environments this location supports.
   * </pre>
   *
   * <code>repeated .google.cloud.functions.v2alpha.Environment environments = 1;</code>
   * @param index The index of the element to return.
   * @return The environments at the given index.
   */
  com.google.cloud.functions.v2alpha.Environment getEnvironments(int index);
  /**
   * <pre>
   * The Cloud Function environments this location supports.
   * </pre>
   *
   * <code>repeated .google.cloud.functions.v2alpha.Environment environments = 1;</code>
   * @return A list containing the enum numeric values on the wire for environments.
   */
  java.util.List<java.lang.Integer>
  getEnvironmentsValueList();
  /**
   * <pre>
   * The Cloud Function environments this location supports.
   * </pre>
   *
   * <code>repeated .google.cloud.functions.v2alpha.Environment environments = 1;</code>
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of environments at the given index.
   */
  int getEnvironmentsValue(int index);
}
