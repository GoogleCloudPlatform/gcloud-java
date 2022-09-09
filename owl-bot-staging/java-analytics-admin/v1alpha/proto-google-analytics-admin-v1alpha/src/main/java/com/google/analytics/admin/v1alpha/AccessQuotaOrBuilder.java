// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/analytics/admin/v1alpha/access_report.proto

package com.google.analytics.admin.v1alpha;

public interface AccessQuotaOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.analytics.admin.v1alpha.AccessQuota)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Properties can use 250,000 tokens per day. Most requests consume fewer than
   * 10 tokens.
   * </pre>
   *
   * <code>.google.analytics.admin.v1alpha.AccessQuotaStatus tokens_per_day = 1;</code>
   * @return Whether the tokensPerDay field is set.
   */
  boolean hasTokensPerDay();
  /**
   * <pre>
   * Properties can use 250,000 tokens per day. Most requests consume fewer than
   * 10 tokens.
   * </pre>
   *
   * <code>.google.analytics.admin.v1alpha.AccessQuotaStatus tokens_per_day = 1;</code>
   * @return The tokensPerDay.
   */
  com.google.analytics.admin.v1alpha.AccessQuotaStatus getTokensPerDay();
  /**
   * <pre>
   * Properties can use 250,000 tokens per day. Most requests consume fewer than
   * 10 tokens.
   * </pre>
   *
   * <code>.google.analytics.admin.v1alpha.AccessQuotaStatus tokens_per_day = 1;</code>
   */
  com.google.analytics.admin.v1alpha.AccessQuotaStatusOrBuilder getTokensPerDayOrBuilder();

  /**
   * <pre>
   * Properties can use 50,000 tokens per hour. An API request consumes a single
   * number of tokens, and that number is deducted from both the hourly and
   * daily quotas.
   * </pre>
   *
   * <code>.google.analytics.admin.v1alpha.AccessQuotaStatus tokens_per_hour = 2;</code>
   * @return Whether the tokensPerHour field is set.
   */
  boolean hasTokensPerHour();
  /**
   * <pre>
   * Properties can use 50,000 tokens per hour. An API request consumes a single
   * number of tokens, and that number is deducted from both the hourly and
   * daily quotas.
   * </pre>
   *
   * <code>.google.analytics.admin.v1alpha.AccessQuotaStatus tokens_per_hour = 2;</code>
   * @return The tokensPerHour.
   */
  com.google.analytics.admin.v1alpha.AccessQuotaStatus getTokensPerHour();
  /**
   * <pre>
   * Properties can use 50,000 tokens per hour. An API request consumes a single
   * number of tokens, and that number is deducted from both the hourly and
   * daily quotas.
   * </pre>
   *
   * <code>.google.analytics.admin.v1alpha.AccessQuotaStatus tokens_per_hour = 2;</code>
   */
  com.google.analytics.admin.v1alpha.AccessQuotaStatusOrBuilder getTokensPerHourOrBuilder();

  /**
   * <pre>
   * Properties can use up to 50 concurrent requests.
   * </pre>
   *
   * <code>.google.analytics.admin.v1alpha.AccessQuotaStatus concurrent_requests = 3;</code>
   * @return Whether the concurrentRequests field is set.
   */
  boolean hasConcurrentRequests();
  /**
   * <pre>
   * Properties can use up to 50 concurrent requests.
   * </pre>
   *
   * <code>.google.analytics.admin.v1alpha.AccessQuotaStatus concurrent_requests = 3;</code>
   * @return The concurrentRequests.
   */
  com.google.analytics.admin.v1alpha.AccessQuotaStatus getConcurrentRequests();
  /**
   * <pre>
   * Properties can use up to 50 concurrent requests.
   * </pre>
   *
   * <code>.google.analytics.admin.v1alpha.AccessQuotaStatus concurrent_requests = 3;</code>
   */
  com.google.analytics.admin.v1alpha.AccessQuotaStatusOrBuilder getConcurrentRequestsOrBuilder();

  /**
   * <pre>
   * Properties and cloud project pairs can have up to 50 server errors per
   * hour.
   * </pre>
   *
   * <code>.google.analytics.admin.v1alpha.AccessQuotaStatus server_errors_per_project_per_hour = 4;</code>
   * @return Whether the serverErrorsPerProjectPerHour field is set.
   */
  boolean hasServerErrorsPerProjectPerHour();
  /**
   * <pre>
   * Properties and cloud project pairs can have up to 50 server errors per
   * hour.
   * </pre>
   *
   * <code>.google.analytics.admin.v1alpha.AccessQuotaStatus server_errors_per_project_per_hour = 4;</code>
   * @return The serverErrorsPerProjectPerHour.
   */
  com.google.analytics.admin.v1alpha.AccessQuotaStatus getServerErrorsPerProjectPerHour();
  /**
   * <pre>
   * Properties and cloud project pairs can have up to 50 server errors per
   * hour.
   * </pre>
   *
   * <code>.google.analytics.admin.v1alpha.AccessQuotaStatus server_errors_per_project_per_hour = 4;</code>
   */
  com.google.analytics.admin.v1alpha.AccessQuotaStatusOrBuilder getServerErrorsPerProjectPerHourOrBuilder();
}
