// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/migrationcenter/v1/migrationcenter.proto

package com.google.cloud.migrationcenter.v1;

public interface SoleTenancyPreferencesOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.migrationcenter.v1.SoleTenancyPreferences)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * CPU overcommit ratio.
   * Acceptable values are between 1.0 and 2.0 inclusive.
   * </pre>
   *
   * <code>double cpu_overcommit_ratio = 1;</code>
   * @return The cpuOvercommitRatio.
   */
  double getCpuOvercommitRatio();

  /**
   * <pre>
   * Sole Tenancy nodes maintenance policy.
   * </pre>
   *
   * <code>.google.cloud.migrationcenter.v1.SoleTenancyPreferences.HostMaintenancePolicy host_maintenance_policy = 2;</code>
   * @return The enum numeric value on the wire for hostMaintenancePolicy.
   */
  int getHostMaintenancePolicyValue();
  /**
   * <pre>
   * Sole Tenancy nodes maintenance policy.
   * </pre>
   *
   * <code>.google.cloud.migrationcenter.v1.SoleTenancyPreferences.HostMaintenancePolicy host_maintenance_policy = 2;</code>
   * @return The hostMaintenancePolicy.
   */
  com.google.cloud.migrationcenter.v1.SoleTenancyPreferences.HostMaintenancePolicy getHostMaintenancePolicy();

  /**
   * <pre>
   * Commitment plan to consider when calculating costs for virtual machine
   * insights and recommendations.
   * If you are unsure which value to set, a 3 year commitment plan is often a
   * good value to start with.
   * </pre>
   *
   * <code>.google.cloud.migrationcenter.v1.SoleTenancyPreferences.CommitmentPlan commitment_plan = 3;</code>
   * @return The enum numeric value on the wire for commitmentPlan.
   */
  int getCommitmentPlanValue();
  /**
   * <pre>
   * Commitment plan to consider when calculating costs for virtual machine
   * insights and recommendations.
   * If you are unsure which value to set, a 3 year commitment plan is often a
   * good value to start with.
   * </pre>
   *
   * <code>.google.cloud.migrationcenter.v1.SoleTenancyPreferences.CommitmentPlan commitment_plan = 3;</code>
   * @return The commitmentPlan.
   */
  com.google.cloud.migrationcenter.v1.SoleTenancyPreferences.CommitmentPlan getCommitmentPlan();

  /**
   * <pre>
   * A list of sole tenant node types.
   * An empty list means that all possible node types will be considered.
   * </pre>
   *
   * <code>repeated .google.cloud.migrationcenter.v1.SoleTenantNodeType node_types = 4;</code>
   */
  java.util.List<com.google.cloud.migrationcenter.v1.SoleTenantNodeType> 
      getNodeTypesList();
  /**
   * <pre>
   * A list of sole tenant node types.
   * An empty list means that all possible node types will be considered.
   * </pre>
   *
   * <code>repeated .google.cloud.migrationcenter.v1.SoleTenantNodeType node_types = 4;</code>
   */
  com.google.cloud.migrationcenter.v1.SoleTenantNodeType getNodeTypes(int index);
  /**
   * <pre>
   * A list of sole tenant node types.
   * An empty list means that all possible node types will be considered.
   * </pre>
   *
   * <code>repeated .google.cloud.migrationcenter.v1.SoleTenantNodeType node_types = 4;</code>
   */
  int getNodeTypesCount();
  /**
   * <pre>
   * A list of sole tenant node types.
   * An empty list means that all possible node types will be considered.
   * </pre>
   *
   * <code>repeated .google.cloud.migrationcenter.v1.SoleTenantNodeType node_types = 4;</code>
   */
  java.util.List<? extends com.google.cloud.migrationcenter.v1.SoleTenantNodeTypeOrBuilder> 
      getNodeTypesOrBuilderList();
  /**
   * <pre>
   * A list of sole tenant node types.
   * An empty list means that all possible node types will be considered.
   * </pre>
   *
   * <code>repeated .google.cloud.migrationcenter.v1.SoleTenantNodeType node_types = 4;</code>
   */
  com.google.cloud.migrationcenter.v1.SoleTenantNodeTypeOrBuilder getNodeTypesOrBuilder(
      int index);
}
