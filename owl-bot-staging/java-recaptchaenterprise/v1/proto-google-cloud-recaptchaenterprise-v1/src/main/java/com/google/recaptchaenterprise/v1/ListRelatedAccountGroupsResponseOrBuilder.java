// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/recaptchaenterprise/v1/recaptchaenterprise.proto

package com.google.recaptchaenterprise.v1;

public interface ListRelatedAccountGroupsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.recaptchaenterprise.v1.ListRelatedAccountGroupsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The groups of related accounts listed by the query.
   * </pre>
   *
   * <code>repeated .google.cloud.recaptchaenterprise.v1.RelatedAccountGroup related_account_groups = 1;</code>
   */
  java.util.List<com.google.recaptchaenterprise.v1.RelatedAccountGroup> 
      getRelatedAccountGroupsList();
  /**
   * <pre>
   * The groups of related accounts listed by the query.
   * </pre>
   *
   * <code>repeated .google.cloud.recaptchaenterprise.v1.RelatedAccountGroup related_account_groups = 1;</code>
   */
  com.google.recaptchaenterprise.v1.RelatedAccountGroup getRelatedAccountGroups(int index);
  /**
   * <pre>
   * The groups of related accounts listed by the query.
   * </pre>
   *
   * <code>repeated .google.cloud.recaptchaenterprise.v1.RelatedAccountGroup related_account_groups = 1;</code>
   */
  int getRelatedAccountGroupsCount();
  /**
   * <pre>
   * The groups of related accounts listed by the query.
   * </pre>
   *
   * <code>repeated .google.cloud.recaptchaenterprise.v1.RelatedAccountGroup related_account_groups = 1;</code>
   */
  java.util.List<? extends com.google.recaptchaenterprise.v1.RelatedAccountGroupOrBuilder> 
      getRelatedAccountGroupsOrBuilderList();
  /**
   * <pre>
   * The groups of related accounts listed by the query.
   * </pre>
   *
   * <code>repeated .google.cloud.recaptchaenterprise.v1.RelatedAccountGroup related_account_groups = 1;</code>
   */
  com.google.recaptchaenterprise.v1.RelatedAccountGroupOrBuilder getRelatedAccountGroupsOrBuilder(
      int index);

  /**
   * <pre>
   * A token, which can be sent as `page_token` to retrieve the next page.
   * If this field is omitted, there are no subsequent pages.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The nextPageToken.
   */
  java.lang.String getNextPageToken();
  /**
   * <pre>
   * A token, which can be sent as `page_token` to retrieve the next page.
   * If this field is omitted, there are no subsequent pages.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString
      getNextPageTokenBytes();
}
