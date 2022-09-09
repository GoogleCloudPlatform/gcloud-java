// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/compute/v1/compute.proto

package com.google.cloud.compute.v1;

public interface InstanceGroupManagerUpdatePolicyOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.InstanceGroupManagerUpdatePolicy)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The instance redistribution policy for regional managed instance groups. Valid values are: - PROACTIVE (default): The group attempts to maintain an even distribution of VM instances across zones in the region. - NONE: For non-autoscaled groups, proactive redistribution is disabled.
   * Check the InstanceRedistributionType enum for the list of possible values.
   * </pre>
   *
   * <code>optional string instance_redistribution_type = 292630424;</code>
   * @return Whether the instanceRedistributionType field is set.
   */
  boolean hasInstanceRedistributionType();
  /**
   * <pre>
   * The instance redistribution policy for regional managed instance groups. Valid values are: - PROACTIVE (default): The group attempts to maintain an even distribution of VM instances across zones in the region. - NONE: For non-autoscaled groups, proactive redistribution is disabled.
   * Check the InstanceRedistributionType enum for the list of possible values.
   * </pre>
   *
   * <code>optional string instance_redistribution_type = 292630424;</code>
   * @return The instanceRedistributionType.
   */
  java.lang.String getInstanceRedistributionType();
  /**
   * <pre>
   * The instance redistribution policy for regional managed instance groups. Valid values are: - PROACTIVE (default): The group attempts to maintain an even distribution of VM instances across zones in the region. - NONE: For non-autoscaled groups, proactive redistribution is disabled.
   * Check the InstanceRedistributionType enum for the list of possible values.
   * </pre>
   *
   * <code>optional string instance_redistribution_type = 292630424;</code>
   * @return The bytes for instanceRedistributionType.
   */
  com.google.protobuf.ByteString
      getInstanceRedistributionTypeBytes();

  /**
   * <pre>
   * The maximum number of instances that can be created above the specified targetSize during the update process. This value can be either a fixed number or, if the group has 10 or more instances, a percentage. If you set a percentage, the number of instances is rounded if necessary. The default value for maxSurge is a fixed value equal to the number of zones in which the managed instance group operates. At least one of either maxSurge or maxUnavailable must be greater than 0. Learn more about maxSurge.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.FixedOrPercent max_surge = 302572691;</code>
   * @return Whether the maxSurge field is set.
   */
  boolean hasMaxSurge();
  /**
   * <pre>
   * The maximum number of instances that can be created above the specified targetSize during the update process. This value can be either a fixed number or, if the group has 10 or more instances, a percentage. If you set a percentage, the number of instances is rounded if necessary. The default value for maxSurge is a fixed value equal to the number of zones in which the managed instance group operates. At least one of either maxSurge or maxUnavailable must be greater than 0. Learn more about maxSurge.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.FixedOrPercent max_surge = 302572691;</code>
   * @return The maxSurge.
   */
  com.google.cloud.compute.v1.FixedOrPercent getMaxSurge();
  /**
   * <pre>
   * The maximum number of instances that can be created above the specified targetSize during the update process. This value can be either a fixed number or, if the group has 10 or more instances, a percentage. If you set a percentage, the number of instances is rounded if necessary. The default value for maxSurge is a fixed value equal to the number of zones in which the managed instance group operates. At least one of either maxSurge or maxUnavailable must be greater than 0. Learn more about maxSurge.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.FixedOrPercent max_surge = 302572691;</code>
   */
  com.google.cloud.compute.v1.FixedOrPercentOrBuilder getMaxSurgeOrBuilder();

  /**
   * <pre>
   * The maximum number of instances that can be unavailable during the update process. An instance is considered available if all of the following conditions are satisfied: - The instance's status is RUNNING. - If there is a health check on the instance group, the instance's health check status must be HEALTHY at least once. If there is no health check on the group, then the instance only needs to have a status of RUNNING to be considered available. This value can be either a fixed number or, if the group has 10 or more instances, a percentage. If you set a percentage, the number of instances is rounded if necessary. The default value for maxUnavailable is a fixed value equal to the number of zones in which the managed instance group operates. At least one of either maxSurge or maxUnavailable must be greater than 0. Learn more about maxUnavailable.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.FixedOrPercent max_unavailable = 404940277;</code>
   * @return Whether the maxUnavailable field is set.
   */
  boolean hasMaxUnavailable();
  /**
   * <pre>
   * The maximum number of instances that can be unavailable during the update process. An instance is considered available if all of the following conditions are satisfied: - The instance's status is RUNNING. - If there is a health check on the instance group, the instance's health check status must be HEALTHY at least once. If there is no health check on the group, then the instance only needs to have a status of RUNNING to be considered available. This value can be either a fixed number or, if the group has 10 or more instances, a percentage. If you set a percentage, the number of instances is rounded if necessary. The default value for maxUnavailable is a fixed value equal to the number of zones in which the managed instance group operates. At least one of either maxSurge or maxUnavailable must be greater than 0. Learn more about maxUnavailable.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.FixedOrPercent max_unavailable = 404940277;</code>
   * @return The maxUnavailable.
   */
  com.google.cloud.compute.v1.FixedOrPercent getMaxUnavailable();
  /**
   * <pre>
   * The maximum number of instances that can be unavailable during the update process. An instance is considered available if all of the following conditions are satisfied: - The instance's status is RUNNING. - If there is a health check on the instance group, the instance's health check status must be HEALTHY at least once. If there is no health check on the group, then the instance only needs to have a status of RUNNING to be considered available. This value can be either a fixed number or, if the group has 10 or more instances, a percentage. If you set a percentage, the number of instances is rounded if necessary. The default value for maxUnavailable is a fixed value equal to the number of zones in which the managed instance group operates. At least one of either maxSurge or maxUnavailable must be greater than 0. Learn more about maxUnavailable.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.FixedOrPercent max_unavailable = 404940277;</code>
   */
  com.google.cloud.compute.v1.FixedOrPercentOrBuilder getMaxUnavailableOrBuilder();

  /**
   * <pre>
   * Minimal action to be taken on an instance. Use this option to minimize disruption as much as possible or to apply a more disruptive action than is necessary. - To limit disruption as much as possible, set the minimal action to REFRESH. If your update requires a more disruptive action, Compute Engine performs the necessary action to execute the update. - To apply a more disruptive action than is strictly necessary, set the minimal action to RESTART or REPLACE. For example, Compute Engine does not need to restart a VM to change its metadata. But if your application reads instance metadata only when a VM is restarted, you can set the minimal action to RESTART in order to pick up metadata changes.
   * Check the MinimalAction enum for the list of possible values.
   * </pre>
   *
   * <code>optional string minimal_action = 270567060;</code>
   * @return Whether the minimalAction field is set.
   */
  boolean hasMinimalAction();
  /**
   * <pre>
   * Minimal action to be taken on an instance. Use this option to minimize disruption as much as possible or to apply a more disruptive action than is necessary. - To limit disruption as much as possible, set the minimal action to REFRESH. If your update requires a more disruptive action, Compute Engine performs the necessary action to execute the update. - To apply a more disruptive action than is strictly necessary, set the minimal action to RESTART or REPLACE. For example, Compute Engine does not need to restart a VM to change its metadata. But if your application reads instance metadata only when a VM is restarted, you can set the minimal action to RESTART in order to pick up metadata changes.
   * Check the MinimalAction enum for the list of possible values.
   * </pre>
   *
   * <code>optional string minimal_action = 270567060;</code>
   * @return The minimalAction.
   */
  java.lang.String getMinimalAction();
  /**
   * <pre>
   * Minimal action to be taken on an instance. Use this option to minimize disruption as much as possible or to apply a more disruptive action than is necessary. - To limit disruption as much as possible, set the minimal action to REFRESH. If your update requires a more disruptive action, Compute Engine performs the necessary action to execute the update. - To apply a more disruptive action than is strictly necessary, set the minimal action to RESTART or REPLACE. For example, Compute Engine does not need to restart a VM to change its metadata. But if your application reads instance metadata only when a VM is restarted, you can set the minimal action to RESTART in order to pick up metadata changes.
   * Check the MinimalAction enum for the list of possible values.
   * </pre>
   *
   * <code>optional string minimal_action = 270567060;</code>
   * @return The bytes for minimalAction.
   */
  com.google.protobuf.ByteString
      getMinimalActionBytes();

  /**
   * <pre>
   * Most disruptive action that is allowed to be taken on an instance. You can specify either NONE to forbid any actions, REFRESH to allow actions that do not need instance restart, RESTART to allow actions that can be applied without instance replacing or REPLACE to allow all possible actions. If the Updater determines that the minimal update action needed is more disruptive than most disruptive allowed action you specify it will not perform the update at all.
   * Check the MostDisruptiveAllowedAction enum for the list of possible values.
   * </pre>
   *
   * <code>optional string most_disruptive_allowed_action = 66103053;</code>
   * @return Whether the mostDisruptiveAllowedAction field is set.
   */
  boolean hasMostDisruptiveAllowedAction();
  /**
   * <pre>
   * Most disruptive action that is allowed to be taken on an instance. You can specify either NONE to forbid any actions, REFRESH to allow actions that do not need instance restart, RESTART to allow actions that can be applied without instance replacing or REPLACE to allow all possible actions. If the Updater determines that the minimal update action needed is more disruptive than most disruptive allowed action you specify it will not perform the update at all.
   * Check the MostDisruptiveAllowedAction enum for the list of possible values.
   * </pre>
   *
   * <code>optional string most_disruptive_allowed_action = 66103053;</code>
   * @return The mostDisruptiveAllowedAction.
   */
  java.lang.String getMostDisruptiveAllowedAction();
  /**
   * <pre>
   * Most disruptive action that is allowed to be taken on an instance. You can specify either NONE to forbid any actions, REFRESH to allow actions that do not need instance restart, RESTART to allow actions that can be applied without instance replacing or REPLACE to allow all possible actions. If the Updater determines that the minimal update action needed is more disruptive than most disruptive allowed action you specify it will not perform the update at all.
   * Check the MostDisruptiveAllowedAction enum for the list of possible values.
   * </pre>
   *
   * <code>optional string most_disruptive_allowed_action = 66103053;</code>
   * @return The bytes for mostDisruptiveAllowedAction.
   */
  com.google.protobuf.ByteString
      getMostDisruptiveAllowedActionBytes();

  /**
   * <pre>
   * What action should be used to replace instances. See minimal_action.REPLACE
   * Check the ReplacementMethod enum for the list of possible values.
   * </pre>
   *
   * <code>optional string replacement_method = 505931694;</code>
   * @return Whether the replacementMethod field is set.
   */
  boolean hasReplacementMethod();
  /**
   * <pre>
   * What action should be used to replace instances. See minimal_action.REPLACE
   * Check the ReplacementMethod enum for the list of possible values.
   * </pre>
   *
   * <code>optional string replacement_method = 505931694;</code>
   * @return The replacementMethod.
   */
  java.lang.String getReplacementMethod();
  /**
   * <pre>
   * What action should be used to replace instances. See minimal_action.REPLACE
   * Check the ReplacementMethod enum for the list of possible values.
   * </pre>
   *
   * <code>optional string replacement_method = 505931694;</code>
   * @return The bytes for replacementMethod.
   */
  com.google.protobuf.ByteString
      getReplacementMethodBytes();

  /**
   * <pre>
   * The type of update process. You can specify either PROACTIVE so that the instance group manager proactively executes actions in order to bring instances to their target versions or OPPORTUNISTIC so that no action is proactively executed but the update will be performed as part of other actions (for example, resizes or recreateInstances calls).
   * Check the Type enum for the list of possible values.
   * </pre>
   *
   * <code>optional string type = 3575610;</code>
   * @return Whether the type field is set.
   */
  boolean hasType();
  /**
   * <pre>
   * The type of update process. You can specify either PROACTIVE so that the instance group manager proactively executes actions in order to bring instances to their target versions or OPPORTUNISTIC so that no action is proactively executed but the update will be performed as part of other actions (for example, resizes or recreateInstances calls).
   * Check the Type enum for the list of possible values.
   * </pre>
   *
   * <code>optional string type = 3575610;</code>
   * @return The type.
   */
  java.lang.String getType();
  /**
   * <pre>
   * The type of update process. You can specify either PROACTIVE so that the instance group manager proactively executes actions in order to bring instances to their target versions or OPPORTUNISTIC so that no action is proactively executed but the update will be performed as part of other actions (for example, resizes or recreateInstances calls).
   * Check the Type enum for the list of possible values.
   * </pre>
   *
   * <code>optional string type = 3575610;</code>
   * @return The bytes for type.
   */
  com.google.protobuf.ByteString
      getTypeBytes();
}
