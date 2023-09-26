// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/notebooks/v1/runtime.proto

package com.google.cloud.notebooks.v1;

public interface RuntimeOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.notebooks.v1.Runtime)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Output only. The resource name of the runtime.
   * Format:
   * `projects/{project}/locations/{location}/runtimes/{runtimeId}`
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Output only. The resource name of the runtime.
   * Format:
   * `projects/{project}/locations/{location}/runtimes/{runtimeId}`
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * Use a Compute Engine VM image to start the managed notebook instance.
   * </pre>
   *
   * <code>.google.cloud.notebooks.v1.VirtualMachine virtual_machine = 2;</code>
   * @return Whether the virtualMachine field is set.
   */
  boolean hasVirtualMachine();
  /**
   * <pre>
   * Use a Compute Engine VM image to start the managed notebook instance.
   * </pre>
   *
   * <code>.google.cloud.notebooks.v1.VirtualMachine virtual_machine = 2;</code>
   * @return The virtualMachine.
   */
  com.google.cloud.notebooks.v1.VirtualMachine getVirtualMachine();
  /**
   * <pre>
   * Use a Compute Engine VM image to start the managed notebook instance.
   * </pre>
   *
   * <code>.google.cloud.notebooks.v1.VirtualMachine virtual_machine = 2;</code>
   */
  com.google.cloud.notebooks.v1.VirtualMachineOrBuilder getVirtualMachineOrBuilder();

  /**
   * <pre>
   * Output only. Runtime state.
   * </pre>
   *
   * <code>.google.cloud.notebooks.v1.Runtime.State state = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The enum numeric value on the wire for state.
   */
  int getStateValue();
  /**
   * <pre>
   * Output only. Runtime state.
   * </pre>
   *
   * <code>.google.cloud.notebooks.v1.Runtime.State state = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The state.
   */
  com.google.cloud.notebooks.v1.Runtime.State getState();

  /**
   * <pre>
   * Output only. Runtime health_state.
   * </pre>
   *
   * <code>.google.cloud.notebooks.v1.Runtime.HealthState health_state = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The enum numeric value on the wire for healthState.
   */
  int getHealthStateValue();
  /**
   * <pre>
   * Output only. Runtime health_state.
   * </pre>
   *
   * <code>.google.cloud.notebooks.v1.Runtime.HealthState health_state = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The healthState.
   */
  com.google.cloud.notebooks.v1.Runtime.HealthState getHealthState();

  /**
   * <pre>
   * The config settings for accessing runtime.
   * </pre>
   *
   * <code>.google.cloud.notebooks.v1.RuntimeAccessConfig access_config = 5;</code>
   * @return Whether the accessConfig field is set.
   */
  boolean hasAccessConfig();
  /**
   * <pre>
   * The config settings for accessing runtime.
   * </pre>
   *
   * <code>.google.cloud.notebooks.v1.RuntimeAccessConfig access_config = 5;</code>
   * @return The accessConfig.
   */
  com.google.cloud.notebooks.v1.RuntimeAccessConfig getAccessConfig();
  /**
   * <pre>
   * The config settings for accessing runtime.
   * </pre>
   *
   * <code>.google.cloud.notebooks.v1.RuntimeAccessConfig access_config = 5;</code>
   */
  com.google.cloud.notebooks.v1.RuntimeAccessConfigOrBuilder getAccessConfigOrBuilder();

  /**
   * <pre>
   * The config settings for software inside the runtime.
   * </pre>
   *
   * <code>.google.cloud.notebooks.v1.RuntimeSoftwareConfig software_config = 6;</code>
   * @return Whether the softwareConfig field is set.
   */
  boolean hasSoftwareConfig();
  /**
   * <pre>
   * The config settings for software inside the runtime.
   * </pre>
   *
   * <code>.google.cloud.notebooks.v1.RuntimeSoftwareConfig software_config = 6;</code>
   * @return The softwareConfig.
   */
  com.google.cloud.notebooks.v1.RuntimeSoftwareConfig getSoftwareConfig();
  /**
   * <pre>
   * The config settings for software inside the runtime.
   * </pre>
   *
   * <code>.google.cloud.notebooks.v1.RuntimeSoftwareConfig software_config = 6;</code>
   */
  com.google.cloud.notebooks.v1.RuntimeSoftwareConfigOrBuilder getSoftwareConfigOrBuilder();

  /**
   * <pre>
   * Output only. Contains Runtime daemon metrics such as Service status and JupyterLab
   * stats.
   * </pre>
   *
   * <code>.google.cloud.notebooks.v1.RuntimeMetrics metrics = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the metrics field is set.
   */
  boolean hasMetrics();
  /**
   * <pre>
   * Output only. Contains Runtime daemon metrics such as Service status and JupyterLab
   * stats.
   * </pre>
   *
   * <code>.google.cloud.notebooks.v1.RuntimeMetrics metrics = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The metrics.
   */
  com.google.cloud.notebooks.v1.RuntimeMetrics getMetrics();
  /**
   * <pre>
   * Output only. Contains Runtime daemon metrics such as Service status and JupyterLab
   * stats.
   * </pre>
   *
   * <code>.google.cloud.notebooks.v1.RuntimeMetrics metrics = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.cloud.notebooks.v1.RuntimeMetricsOrBuilder getMetricsOrBuilder();

  /**
   * <pre>
   * Output only. Runtime creation time.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 20 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   * <pre>
   * Output only. Runtime creation time.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 20 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   * <pre>
   * Output only. Runtime creation time.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 20 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   * <pre>
   * Output only. Runtime update time.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 21 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the updateTime field is set.
   */
  boolean hasUpdateTime();
  /**
   * <pre>
   * Output only. Runtime update time.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 21 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The updateTime.
   */
  com.google.protobuf.Timestamp getUpdateTime();
  /**
   * <pre>
   * Output only. Runtime update time.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 21 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder();

  com.google.cloud.notebooks.v1.Runtime.RuntimeTypeCase getRuntimeTypeCase();
}
