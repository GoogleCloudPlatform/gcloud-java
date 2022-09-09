// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/gkehub/v1beta/metering/metering.proto

package com.google.cloud.gkehub.metering.v1beta;

public interface MembershipStateOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.gkehub.metering.v1beta.MembershipState)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The time stamp of the most recent measurement of the number of vCPUs
   * in the cluster.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp last_measurement_time = 1;</code>
   * @return Whether the lastMeasurementTime field is set.
   */
  boolean hasLastMeasurementTime();
  /**
   * <pre>
   * The time stamp of the most recent measurement of the number of vCPUs
   * in the cluster.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp last_measurement_time = 1;</code>
   * @return The lastMeasurementTime.
   */
  com.google.protobuf.Timestamp getLastMeasurementTime();
  /**
   * <pre>
   * The time stamp of the most recent measurement of the number of vCPUs
   * in the cluster.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp last_measurement_time = 1;</code>
   */
  com.google.protobuf.TimestampOrBuilder getLastMeasurementTimeOrBuilder();

  /**
   * <pre>
   * The vCPUs capacity in the cluster according to the most recent
   * measurement (1/1000 precision).
   * </pre>
   *
   * <code>float precise_last_measured_cluster_vcpu_capacity = 3;</code>
   * @return The preciseLastMeasuredClusterVcpuCapacity.
   */
  float getPreciseLastMeasuredClusterVcpuCapacity();
}
