// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/scheduler/v1beta1/cloudscheduler.proto

package com.google.cloud.scheduler.v1beta1;

public interface RunJobRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.scheduler.v1beta1.RunJobRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required.
   * The job name. For example:
   * `projects/PROJECT_ID/locations/LOCATION_ID/jobs/JOB_ID`.
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  java.lang.String getName();
  /**
   * <pre>
   * Required.
   * The job name. For example:
   * `projects/PROJECT_ID/locations/LOCATION_ID/jobs/JOB_ID`.
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  com.google.protobuf.ByteString
      getNameBytes();
}
