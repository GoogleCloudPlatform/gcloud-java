// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/policytroubleshooter/iam/v3/troubleshooter.proto

package com.google.cloud.policytroubleshooter.iam.v3;

public interface AllowPolicyExplanationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.policytroubleshooter.iam.v3.AllowPolicyExplanation)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Indicates whether the principal has the specified permission for the
   * specified resource, based on evaluating all applicable IAM allow policies.
   * </pre>
   *
   * <code>.google.cloud.policytroubleshooter.iam.v3.AllowAccessState allow_access_state = 1;</code>
   * @return The enum numeric value on the wire for allowAccessState.
   */
  int getAllowAccessStateValue();
  /**
   * <pre>
   * Indicates whether the principal has the specified permission for the
   * specified resource, based on evaluating all applicable IAM allow policies.
   * </pre>
   *
   * <code>.google.cloud.policytroubleshooter.iam.v3.AllowAccessState allow_access_state = 1;</code>
   * @return The allowAccessState.
   */
  com.google.cloud.policytroubleshooter.iam.v3.AllowAccessState getAllowAccessState();

  /**
   * <pre>
   * List of IAM allow policies that were evaluated to check the principal's
   * permissions, with annotations to indicate how each policy contributed to
   * the final result.
   *
   * The list of policies includes the policy for the resource itself, as well
   * as allow policies that are inherited from higher levels of the resource
   * hierarchy, including the organization, the folder, and the project.
   *
   * To learn more about the resource hierarchy, see
   * https://cloud.google.com/iam/help/resource-hierarchy.
   * </pre>
   *
   * <code>repeated .google.cloud.policytroubleshooter.iam.v3.ExplainedAllowPolicy explained_policies = 2;</code>
   */
  java.util.List<com.google.cloud.policytroubleshooter.iam.v3.ExplainedAllowPolicy> 
      getExplainedPoliciesList();
  /**
   * <pre>
   * List of IAM allow policies that were evaluated to check the principal's
   * permissions, with annotations to indicate how each policy contributed to
   * the final result.
   *
   * The list of policies includes the policy for the resource itself, as well
   * as allow policies that are inherited from higher levels of the resource
   * hierarchy, including the organization, the folder, and the project.
   *
   * To learn more about the resource hierarchy, see
   * https://cloud.google.com/iam/help/resource-hierarchy.
   * </pre>
   *
   * <code>repeated .google.cloud.policytroubleshooter.iam.v3.ExplainedAllowPolicy explained_policies = 2;</code>
   */
  com.google.cloud.policytroubleshooter.iam.v3.ExplainedAllowPolicy getExplainedPolicies(int index);
  /**
   * <pre>
   * List of IAM allow policies that were evaluated to check the principal's
   * permissions, with annotations to indicate how each policy contributed to
   * the final result.
   *
   * The list of policies includes the policy for the resource itself, as well
   * as allow policies that are inherited from higher levels of the resource
   * hierarchy, including the organization, the folder, and the project.
   *
   * To learn more about the resource hierarchy, see
   * https://cloud.google.com/iam/help/resource-hierarchy.
   * </pre>
   *
   * <code>repeated .google.cloud.policytroubleshooter.iam.v3.ExplainedAllowPolicy explained_policies = 2;</code>
   */
  int getExplainedPoliciesCount();
  /**
   * <pre>
   * List of IAM allow policies that were evaluated to check the principal's
   * permissions, with annotations to indicate how each policy contributed to
   * the final result.
   *
   * The list of policies includes the policy for the resource itself, as well
   * as allow policies that are inherited from higher levels of the resource
   * hierarchy, including the organization, the folder, and the project.
   *
   * To learn more about the resource hierarchy, see
   * https://cloud.google.com/iam/help/resource-hierarchy.
   * </pre>
   *
   * <code>repeated .google.cloud.policytroubleshooter.iam.v3.ExplainedAllowPolicy explained_policies = 2;</code>
   */
  java.util.List<? extends com.google.cloud.policytroubleshooter.iam.v3.ExplainedAllowPolicyOrBuilder> 
      getExplainedPoliciesOrBuilderList();
  /**
   * <pre>
   * List of IAM allow policies that were evaluated to check the principal's
   * permissions, with annotations to indicate how each policy contributed to
   * the final result.
   *
   * The list of policies includes the policy for the resource itself, as well
   * as allow policies that are inherited from higher levels of the resource
   * hierarchy, including the organization, the folder, and the project.
   *
   * To learn more about the resource hierarchy, see
   * https://cloud.google.com/iam/help/resource-hierarchy.
   * </pre>
   *
   * <code>repeated .google.cloud.policytroubleshooter.iam.v3.ExplainedAllowPolicy explained_policies = 2;</code>
   */
  com.google.cloud.policytroubleshooter.iam.v3.ExplainedAllowPolicyOrBuilder getExplainedPoliciesOrBuilder(
      int index);

  /**
   * <pre>
   * The relevance of the allow policy type to the overall access state.
   * </pre>
   *
   * <code>.google.cloud.policytroubleshooter.iam.v3.HeuristicRelevance relevance = 3;</code>
   * @return The enum numeric value on the wire for relevance.
   */
  int getRelevanceValue();
  /**
   * <pre>
   * The relevance of the allow policy type to the overall access state.
   * </pre>
   *
   * <code>.google.cloud.policytroubleshooter.iam.v3.HeuristicRelevance relevance = 3;</code>
   * @return The relevance.
   */
  com.google.cloud.policytroubleshooter.iam.v3.HeuristicRelevance getRelevance();
}
