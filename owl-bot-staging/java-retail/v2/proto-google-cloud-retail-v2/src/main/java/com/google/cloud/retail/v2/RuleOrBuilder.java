// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/retail/v2/common.proto

package com.google.cloud.retail.v2;

public interface RuleOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.retail.v2.Rule)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * A boost action.
   * </pre>
   *
   * <code>.google.cloud.retail.v2.Rule.BoostAction boost_action = 2;</code>
   * @return Whether the boostAction field is set.
   */
  boolean hasBoostAction();
  /**
   * <pre>
   * A boost action.
   * </pre>
   *
   * <code>.google.cloud.retail.v2.Rule.BoostAction boost_action = 2;</code>
   * @return The boostAction.
   */
  com.google.cloud.retail.v2.Rule.BoostAction getBoostAction();
  /**
   * <pre>
   * A boost action.
   * </pre>
   *
   * <code>.google.cloud.retail.v2.Rule.BoostAction boost_action = 2;</code>
   */
  com.google.cloud.retail.v2.Rule.BoostActionOrBuilder getBoostActionOrBuilder();

  /**
   * <pre>
   * Redirects a shopper to a specific page.
   * </pre>
   *
   * <code>.google.cloud.retail.v2.Rule.RedirectAction redirect_action = 3;</code>
   * @return Whether the redirectAction field is set.
   */
  boolean hasRedirectAction();
  /**
   * <pre>
   * Redirects a shopper to a specific page.
   * </pre>
   *
   * <code>.google.cloud.retail.v2.Rule.RedirectAction redirect_action = 3;</code>
   * @return The redirectAction.
   */
  com.google.cloud.retail.v2.Rule.RedirectAction getRedirectAction();
  /**
   * <pre>
   * Redirects a shopper to a specific page.
   * </pre>
   *
   * <code>.google.cloud.retail.v2.Rule.RedirectAction redirect_action = 3;</code>
   */
  com.google.cloud.retail.v2.Rule.RedirectActionOrBuilder getRedirectActionOrBuilder();

  /**
   * <pre>
   * Treats specific term as a synonym with a group of terms.
   * Group of terms will not be treated as synonyms with the specific term.
   * </pre>
   *
   * <code>.google.cloud.retail.v2.Rule.OnewaySynonymsAction oneway_synonyms_action = 6;</code>
   * @return Whether the onewaySynonymsAction field is set.
   */
  boolean hasOnewaySynonymsAction();
  /**
   * <pre>
   * Treats specific term as a synonym with a group of terms.
   * Group of terms will not be treated as synonyms with the specific term.
   * </pre>
   *
   * <code>.google.cloud.retail.v2.Rule.OnewaySynonymsAction oneway_synonyms_action = 6;</code>
   * @return The onewaySynonymsAction.
   */
  com.google.cloud.retail.v2.Rule.OnewaySynonymsAction getOnewaySynonymsAction();
  /**
   * <pre>
   * Treats specific term as a synonym with a group of terms.
   * Group of terms will not be treated as synonyms with the specific term.
   * </pre>
   *
   * <code>.google.cloud.retail.v2.Rule.OnewaySynonymsAction oneway_synonyms_action = 6;</code>
   */
  com.google.cloud.retail.v2.Rule.OnewaySynonymsActionOrBuilder getOnewaySynonymsActionOrBuilder();

  /**
   * <pre>
   * Prevents term from being associated with other terms.
   * </pre>
   *
   * <code>.google.cloud.retail.v2.Rule.DoNotAssociateAction do_not_associate_action = 7;</code>
   * @return Whether the doNotAssociateAction field is set.
   */
  boolean hasDoNotAssociateAction();
  /**
   * <pre>
   * Prevents term from being associated with other terms.
   * </pre>
   *
   * <code>.google.cloud.retail.v2.Rule.DoNotAssociateAction do_not_associate_action = 7;</code>
   * @return The doNotAssociateAction.
   */
  com.google.cloud.retail.v2.Rule.DoNotAssociateAction getDoNotAssociateAction();
  /**
   * <pre>
   * Prevents term from being associated with other terms.
   * </pre>
   *
   * <code>.google.cloud.retail.v2.Rule.DoNotAssociateAction do_not_associate_action = 7;</code>
   */
  com.google.cloud.retail.v2.Rule.DoNotAssociateActionOrBuilder getDoNotAssociateActionOrBuilder();

  /**
   * <pre>
   * Replaces specific terms in the query.
   * </pre>
   *
   * <code>.google.cloud.retail.v2.Rule.ReplacementAction replacement_action = 8;</code>
   * @return Whether the replacementAction field is set.
   */
  boolean hasReplacementAction();
  /**
   * <pre>
   * Replaces specific terms in the query.
   * </pre>
   *
   * <code>.google.cloud.retail.v2.Rule.ReplacementAction replacement_action = 8;</code>
   * @return The replacementAction.
   */
  com.google.cloud.retail.v2.Rule.ReplacementAction getReplacementAction();
  /**
   * <pre>
   * Replaces specific terms in the query.
   * </pre>
   *
   * <code>.google.cloud.retail.v2.Rule.ReplacementAction replacement_action = 8;</code>
   */
  com.google.cloud.retail.v2.Rule.ReplacementActionOrBuilder getReplacementActionOrBuilder();

  /**
   * <pre>
   * Ignores specific terms from query during search.
   * </pre>
   *
   * <code>.google.cloud.retail.v2.Rule.IgnoreAction ignore_action = 9;</code>
   * @return Whether the ignoreAction field is set.
   */
  boolean hasIgnoreAction();
  /**
   * <pre>
   * Ignores specific terms from query during search.
   * </pre>
   *
   * <code>.google.cloud.retail.v2.Rule.IgnoreAction ignore_action = 9;</code>
   * @return The ignoreAction.
   */
  com.google.cloud.retail.v2.Rule.IgnoreAction getIgnoreAction();
  /**
   * <pre>
   * Ignores specific terms from query during search.
   * </pre>
   *
   * <code>.google.cloud.retail.v2.Rule.IgnoreAction ignore_action = 9;</code>
   */
  com.google.cloud.retail.v2.Rule.IgnoreActionOrBuilder getIgnoreActionOrBuilder();

  /**
   * <pre>
   * Filters results.
   * </pre>
   *
   * <code>.google.cloud.retail.v2.Rule.FilterAction filter_action = 10;</code>
   * @return Whether the filterAction field is set.
   */
  boolean hasFilterAction();
  /**
   * <pre>
   * Filters results.
   * </pre>
   *
   * <code>.google.cloud.retail.v2.Rule.FilterAction filter_action = 10;</code>
   * @return The filterAction.
   */
  com.google.cloud.retail.v2.Rule.FilterAction getFilterAction();
  /**
   * <pre>
   * Filters results.
   * </pre>
   *
   * <code>.google.cloud.retail.v2.Rule.FilterAction filter_action = 10;</code>
   */
  com.google.cloud.retail.v2.Rule.FilterActionOrBuilder getFilterActionOrBuilder();

  /**
   * <pre>
   * Treats a set of terms as synonyms of one another.
   * </pre>
   *
   * <code>.google.cloud.retail.v2.Rule.TwowaySynonymsAction twoway_synonyms_action = 11;</code>
   * @return Whether the twowaySynonymsAction field is set.
   */
  boolean hasTwowaySynonymsAction();
  /**
   * <pre>
   * Treats a set of terms as synonyms of one another.
   * </pre>
   *
   * <code>.google.cloud.retail.v2.Rule.TwowaySynonymsAction twoway_synonyms_action = 11;</code>
   * @return The twowaySynonymsAction.
   */
  com.google.cloud.retail.v2.Rule.TwowaySynonymsAction getTwowaySynonymsAction();
  /**
   * <pre>
   * Treats a set of terms as synonyms of one another.
   * </pre>
   *
   * <code>.google.cloud.retail.v2.Rule.TwowaySynonymsAction twoway_synonyms_action = 11;</code>
   */
  com.google.cloud.retail.v2.Rule.TwowaySynonymsActionOrBuilder getTwowaySynonymsActionOrBuilder();

  /**
   * <pre>
   * Required. The condition that triggers the rule.
   * If the condition is empty, the rule will always apply.
   * </pre>
   *
   * <code>.google.cloud.retail.v2.Condition condition = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the condition field is set.
   */
  boolean hasCondition();
  /**
   * <pre>
   * Required. The condition that triggers the rule.
   * If the condition is empty, the rule will always apply.
   * </pre>
   *
   * <code>.google.cloud.retail.v2.Condition condition = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The condition.
   */
  com.google.cloud.retail.v2.Condition getCondition();
  /**
   * <pre>
   * Required. The condition that triggers the rule.
   * If the condition is empty, the rule will always apply.
   * </pre>
   *
   * <code>.google.cloud.retail.v2.Condition condition = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.cloud.retail.v2.ConditionOrBuilder getConditionOrBuilder();

  public com.google.cloud.retail.v2.Rule.ActionCase getActionCase();
}
