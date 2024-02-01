// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1beta1/machine_resources.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.aiplatform.v1beta1;

public interface DedicatedResourcesOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1beta1.DedicatedResources)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. Immutable. The specification of a single machine used by the
   * prediction.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.MachineSpec machine_spec = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.field_behavior) = IMMUTABLE];</code>
   * @return Whether the machineSpec field is set.
   */
  boolean hasMachineSpec();
  /**
   * <pre>
   * Required. Immutable. The specification of a single machine used by the
   * prediction.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.MachineSpec machine_spec = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The machineSpec.
   */
  com.google.cloud.aiplatform.v1beta1.MachineSpec getMachineSpec();
  /**
   * <pre>
   * Required. Immutable. The specification of a single machine used by the
   * prediction.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.MachineSpec machine_spec = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.field_behavior) = IMMUTABLE];</code>
   */
  com.google.cloud.aiplatform.v1beta1.MachineSpecOrBuilder getMachineSpecOrBuilder();

  /**
   * <pre>
   * Required. Immutable. The minimum number of machine replicas this
   * DeployedModel will be always deployed on. This value must be greater than
   * or equal to 1.
   *
   * If traffic against the DeployedModel increases, it may dynamically be
   * deployed onto more replicas, and as traffic decreases, some of these extra
   * replicas may be freed.
   * </pre>
   *
   * <code>int32 min_replica_count = 2 [(.google.api.field_behavior) = REQUIRED, (.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The minReplicaCount.
   */
  int getMinReplicaCount();

  /**
   * <pre>
   * Immutable. The maximum number of replicas this DeployedModel may be
   * deployed on when the traffic against it increases. If the requested value
   * is too large, the deployment will error, but if deployment succeeds then
   * the ability to scale the model to that many replicas is guaranteed (barring
   * service outages). If traffic against the DeployedModel increases beyond
   * what its replicas at maximum may handle, a portion of the traffic will be
   * dropped. If this value is not provided, will use
   * [min_replica_count][google.cloud.aiplatform.v1beta1.DedicatedResources.min_replica_count]
   * as the default value.
   *
   * The value of this field impacts the charge against Vertex CPU and GPU
   * quotas. Specifically, you will be charged for (max_replica_count *
   * number of cores in the selected machine type) and (max_replica_count *
   * number of GPUs per replica in the selected machine type).
   * </pre>
   *
   * <code>int32 max_replica_count = 3 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The maxReplicaCount.
   */
  int getMaxReplicaCount();

  /**
   * <pre>
   * Immutable. The metric specifications that overrides a resource
   * utilization metric (CPU utilization, accelerator's duty cycle, and so on)
   * target value (default to 60 if not set). At most one entry is allowed per
   * metric.
   *
   * If
   * [machine_spec.accelerator_count][google.cloud.aiplatform.v1beta1.MachineSpec.accelerator_count]
   * is above 0, the autoscaling will be based on both CPU utilization and
   * accelerator's duty cycle metrics and scale up when either metrics exceeds
   * its target value while scale down if both metrics are under their target
   * value. The default target value is 60 for both metrics.
   *
   * If
   * [machine_spec.accelerator_count][google.cloud.aiplatform.v1beta1.MachineSpec.accelerator_count]
   * is 0, the autoscaling will be based on CPU utilization metric only with
   * default target value 60 if not explicitly set.
   *
   * For example, in the case of Online Prediction, if you want to override
   * target CPU utilization to 80, you should set
   * [autoscaling_metric_specs.metric_name][google.cloud.aiplatform.v1beta1.AutoscalingMetricSpec.metric_name]
   * to `aiplatform.googleapis.com/prediction/online/cpu/utilization` and
   * [autoscaling_metric_specs.target][google.cloud.aiplatform.v1beta1.AutoscalingMetricSpec.target]
   * to `80`.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.AutoscalingMetricSpec autoscaling_metric_specs = 4 [(.google.api.field_behavior) = IMMUTABLE];</code>
   */
  java.util.List<com.google.cloud.aiplatform.v1beta1.AutoscalingMetricSpec> 
      getAutoscalingMetricSpecsList();
  /**
   * <pre>
   * Immutable. The metric specifications that overrides a resource
   * utilization metric (CPU utilization, accelerator's duty cycle, and so on)
   * target value (default to 60 if not set). At most one entry is allowed per
   * metric.
   *
   * If
   * [machine_spec.accelerator_count][google.cloud.aiplatform.v1beta1.MachineSpec.accelerator_count]
   * is above 0, the autoscaling will be based on both CPU utilization and
   * accelerator's duty cycle metrics and scale up when either metrics exceeds
   * its target value while scale down if both metrics are under their target
   * value. The default target value is 60 for both metrics.
   *
   * If
   * [machine_spec.accelerator_count][google.cloud.aiplatform.v1beta1.MachineSpec.accelerator_count]
   * is 0, the autoscaling will be based on CPU utilization metric only with
   * default target value 60 if not explicitly set.
   *
   * For example, in the case of Online Prediction, if you want to override
   * target CPU utilization to 80, you should set
   * [autoscaling_metric_specs.metric_name][google.cloud.aiplatform.v1beta1.AutoscalingMetricSpec.metric_name]
   * to `aiplatform.googleapis.com/prediction/online/cpu/utilization` and
   * [autoscaling_metric_specs.target][google.cloud.aiplatform.v1beta1.AutoscalingMetricSpec.target]
   * to `80`.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.AutoscalingMetricSpec autoscaling_metric_specs = 4 [(.google.api.field_behavior) = IMMUTABLE];</code>
   */
  com.google.cloud.aiplatform.v1beta1.AutoscalingMetricSpec getAutoscalingMetricSpecs(int index);
  /**
   * <pre>
   * Immutable. The metric specifications that overrides a resource
   * utilization metric (CPU utilization, accelerator's duty cycle, and so on)
   * target value (default to 60 if not set). At most one entry is allowed per
   * metric.
   *
   * If
   * [machine_spec.accelerator_count][google.cloud.aiplatform.v1beta1.MachineSpec.accelerator_count]
   * is above 0, the autoscaling will be based on both CPU utilization and
   * accelerator's duty cycle metrics and scale up when either metrics exceeds
   * its target value while scale down if both metrics are under their target
   * value. The default target value is 60 for both metrics.
   *
   * If
   * [machine_spec.accelerator_count][google.cloud.aiplatform.v1beta1.MachineSpec.accelerator_count]
   * is 0, the autoscaling will be based on CPU utilization metric only with
   * default target value 60 if not explicitly set.
   *
   * For example, in the case of Online Prediction, if you want to override
   * target CPU utilization to 80, you should set
   * [autoscaling_metric_specs.metric_name][google.cloud.aiplatform.v1beta1.AutoscalingMetricSpec.metric_name]
   * to `aiplatform.googleapis.com/prediction/online/cpu/utilization` and
   * [autoscaling_metric_specs.target][google.cloud.aiplatform.v1beta1.AutoscalingMetricSpec.target]
   * to `80`.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.AutoscalingMetricSpec autoscaling_metric_specs = 4 [(.google.api.field_behavior) = IMMUTABLE];</code>
   */
  int getAutoscalingMetricSpecsCount();
  /**
   * <pre>
   * Immutable. The metric specifications that overrides a resource
   * utilization metric (CPU utilization, accelerator's duty cycle, and so on)
   * target value (default to 60 if not set). At most one entry is allowed per
   * metric.
   *
   * If
   * [machine_spec.accelerator_count][google.cloud.aiplatform.v1beta1.MachineSpec.accelerator_count]
   * is above 0, the autoscaling will be based on both CPU utilization and
   * accelerator's duty cycle metrics and scale up when either metrics exceeds
   * its target value while scale down if both metrics are under their target
   * value. The default target value is 60 for both metrics.
   *
   * If
   * [machine_spec.accelerator_count][google.cloud.aiplatform.v1beta1.MachineSpec.accelerator_count]
   * is 0, the autoscaling will be based on CPU utilization metric only with
   * default target value 60 if not explicitly set.
   *
   * For example, in the case of Online Prediction, if you want to override
   * target CPU utilization to 80, you should set
   * [autoscaling_metric_specs.metric_name][google.cloud.aiplatform.v1beta1.AutoscalingMetricSpec.metric_name]
   * to `aiplatform.googleapis.com/prediction/online/cpu/utilization` and
   * [autoscaling_metric_specs.target][google.cloud.aiplatform.v1beta1.AutoscalingMetricSpec.target]
   * to `80`.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.AutoscalingMetricSpec autoscaling_metric_specs = 4 [(.google.api.field_behavior) = IMMUTABLE];</code>
   */
  java.util.List<? extends com.google.cloud.aiplatform.v1beta1.AutoscalingMetricSpecOrBuilder> 
      getAutoscalingMetricSpecsOrBuilderList();
  /**
   * <pre>
   * Immutable. The metric specifications that overrides a resource
   * utilization metric (CPU utilization, accelerator's duty cycle, and so on)
   * target value (default to 60 if not set). At most one entry is allowed per
   * metric.
   *
   * If
   * [machine_spec.accelerator_count][google.cloud.aiplatform.v1beta1.MachineSpec.accelerator_count]
   * is above 0, the autoscaling will be based on both CPU utilization and
   * accelerator's duty cycle metrics and scale up when either metrics exceeds
   * its target value while scale down if both metrics are under their target
   * value. The default target value is 60 for both metrics.
   *
   * If
   * [machine_spec.accelerator_count][google.cloud.aiplatform.v1beta1.MachineSpec.accelerator_count]
   * is 0, the autoscaling will be based on CPU utilization metric only with
   * default target value 60 if not explicitly set.
   *
   * For example, in the case of Online Prediction, if you want to override
   * target CPU utilization to 80, you should set
   * [autoscaling_metric_specs.metric_name][google.cloud.aiplatform.v1beta1.AutoscalingMetricSpec.metric_name]
   * to `aiplatform.googleapis.com/prediction/online/cpu/utilization` and
   * [autoscaling_metric_specs.target][google.cloud.aiplatform.v1beta1.AutoscalingMetricSpec.target]
   * to `80`.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.AutoscalingMetricSpec autoscaling_metric_specs = 4 [(.google.api.field_behavior) = IMMUTABLE];</code>
   */
  com.google.cloud.aiplatform.v1beta1.AutoscalingMetricSpecOrBuilder getAutoscalingMetricSpecsOrBuilder(
      int index);
}
