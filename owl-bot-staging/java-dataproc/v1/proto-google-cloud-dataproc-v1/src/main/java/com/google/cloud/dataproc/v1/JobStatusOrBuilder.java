// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dataproc/v1/jobs.proto

package com.google.cloud.dataproc.v1;

public interface JobStatusOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dataproc.v1.JobStatus)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Output only. A state message specifying the overall job state.
   * </pre>
   *
   * <code>.google.cloud.dataproc.v1.JobStatus.State state = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The enum numeric value on the wire for state.
   */
  int getStateValue();
  /**
   * <pre>
   * Output only. A state message specifying the overall job state.
   * </pre>
   *
   * <code>.google.cloud.dataproc.v1.JobStatus.State state = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The state.
   */
  com.google.cloud.dataproc.v1.JobStatus.State getState();

  /**
   * <pre>
   * Optional. Output only. Job state details, such as an error
   * description if the state is &lt;code&gt;ERROR&lt;/code&gt;.
   * </pre>
   *
   * <code>string details = 2 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.field_behavior) = OPTIONAL];</code>
   * @return The details.
   */
  java.lang.String getDetails();
  /**
   * <pre>
   * Optional. Output only. Job state details, such as an error
   * description if the state is &lt;code&gt;ERROR&lt;/code&gt;.
   * </pre>
   *
   * <code>string details = 2 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.field_behavior) = OPTIONAL];</code>
   * @return The bytes for details.
   */
  com.google.protobuf.ByteString
      getDetailsBytes();

  /**
   * <pre>
   * Output only. The time when this state was entered.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp state_start_time = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the stateStartTime field is set.
   */
  boolean hasStateStartTime();
  /**
   * <pre>
   * Output only. The time when this state was entered.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp state_start_time = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The stateStartTime.
   */
  com.google.protobuf.Timestamp getStateStartTime();
  /**
   * <pre>
   * Output only. The time when this state was entered.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp state_start_time = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.protobuf.TimestampOrBuilder getStateStartTimeOrBuilder();

  /**
   * <pre>
   * Output only. Additional state information, which includes
   * status reported by the agent.
   * </pre>
   *
   * <code>.google.cloud.dataproc.v1.JobStatus.Substate substate = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The enum numeric value on the wire for substate.
   */
  int getSubstateValue();
  /**
   * <pre>
   * Output only. Additional state information, which includes
   * status reported by the agent.
   * </pre>
   *
   * <code>.google.cloud.dataproc.v1.JobStatus.Substate substate = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The substate.
   */
  com.google.cloud.dataproc.v1.JobStatus.Substate getSubstate();
}
