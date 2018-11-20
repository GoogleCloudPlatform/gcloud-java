// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/scheduler/v1beta1/job.proto

package com.google.cloud.scheduler.v1beta1;

public interface RetryConfigOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.scheduler.v1beta1.RetryConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The number of attempts that the system will make to run a job using the
   * exponential backoff procedure described by
   * [max_doublings][google.cloud.scheduler.v1beta1.RetryConfig.max_doublings].
   * The default value of retry_count is zero.
   * If retry_count is zero, a job attempt will *not* be retried if
   * it fails. Instead the Cloud Scheduler system will wait for the
   * next scheduled execution time.
   * If retry_count is set to a non-zero number then Cloud Scheduler
   * will retry failed attempts, using exponential backoff,
   * retry_count times, or until the next scheduled execution time,
   * whichever comes first.
   * Values greater than 5 and negative values are not allowed.
   * </pre>
   *
   * <code>int32 retry_count = 1;</code>
   */
  int getRetryCount();

  /**
   * <pre>
   * The time limit for retrying a failed job, measured from time when an
   * execution was first attempted. If specified with
   * [retry_count][google.cloud.scheduler.v1beta1.RetryConfig.retry_count], the job will be retried until both limits are
   * reached.
   * The default value for max_retry_duration is zero, which means retry
   * duration is unlimited.
   * </pre>
   *
   * <code>.google.protobuf.Duration max_retry_duration = 2;</code>
   */
  boolean hasMaxRetryDuration();
  /**
   * <pre>
   * The time limit for retrying a failed job, measured from time when an
   * execution was first attempted. If specified with
   * [retry_count][google.cloud.scheduler.v1beta1.RetryConfig.retry_count], the job will be retried until both limits are
   * reached.
   * The default value for max_retry_duration is zero, which means retry
   * duration is unlimited.
   * </pre>
   *
   * <code>.google.protobuf.Duration max_retry_duration = 2;</code>
   */
  com.google.protobuf.Duration getMaxRetryDuration();
  /**
   * <pre>
   * The time limit for retrying a failed job, measured from time when an
   * execution was first attempted. If specified with
   * [retry_count][google.cloud.scheduler.v1beta1.RetryConfig.retry_count], the job will be retried until both limits are
   * reached.
   * The default value for max_retry_duration is zero, which means retry
   * duration is unlimited.
   * </pre>
   *
   * <code>.google.protobuf.Duration max_retry_duration = 2;</code>
   */
  com.google.protobuf.DurationOrBuilder getMaxRetryDurationOrBuilder();

  /**
   * <pre>
   * The minimum amount of time to wait before retrying a job after
   * it fails.
   * The default value of this field is 5 seconds.
   * </pre>
   *
   * <code>.google.protobuf.Duration min_backoff_duration = 3;</code>
   */
  boolean hasMinBackoffDuration();
  /**
   * <pre>
   * The minimum amount of time to wait before retrying a job after
   * it fails.
   * The default value of this field is 5 seconds.
   * </pre>
   *
   * <code>.google.protobuf.Duration min_backoff_duration = 3;</code>
   */
  com.google.protobuf.Duration getMinBackoffDuration();
  /**
   * <pre>
   * The minimum amount of time to wait before retrying a job after
   * it fails.
   * The default value of this field is 5 seconds.
   * </pre>
   *
   * <code>.google.protobuf.Duration min_backoff_duration = 3;</code>
   */
  com.google.protobuf.DurationOrBuilder getMinBackoffDurationOrBuilder();

  /**
   * <pre>
   * The maximum amount of time to wait before retrying a job after
   * it fails.
   * The default value of this field is 1 hour.
   * </pre>
   *
   * <code>.google.protobuf.Duration max_backoff_duration = 4;</code>
   */
  boolean hasMaxBackoffDuration();
  /**
   * <pre>
   * The maximum amount of time to wait before retrying a job after
   * it fails.
   * The default value of this field is 1 hour.
   * </pre>
   *
   * <code>.google.protobuf.Duration max_backoff_duration = 4;</code>
   */
  com.google.protobuf.Duration getMaxBackoffDuration();
  /**
   * <pre>
   * The maximum amount of time to wait before retrying a job after
   * it fails.
   * The default value of this field is 1 hour.
   * </pre>
   *
   * <code>.google.protobuf.Duration max_backoff_duration = 4;</code>
   */
  com.google.protobuf.DurationOrBuilder getMaxBackoffDurationOrBuilder();

  /**
   * <pre>
   * The time between retries will double `max_doublings` times.
   * A job's retry interval starts at
   * [min_backoff_duration][google.cloud.scheduler.v1beta1.RetryConfig.min_backoff_duration], then doubles
   * `max_doublings` times, then increases linearly, and finally
   * retries retries at intervals of
   * [max_backoff_duration][google.cloud.scheduler.v1beta1.RetryConfig.max_backoff_duration] up to
   * [retry_count][google.cloud.scheduler.v1beta1.RetryConfig.retry_count] times.
   * For example, if [min_backoff_duration][google.cloud.scheduler.v1beta1.RetryConfig.min_backoff_duration] is
   * 10s, [max_backoff_duration][google.cloud.scheduler.v1beta1.RetryConfig.max_backoff_duration] is 300s, and
   * `max_doublings` is 3, then the a job will first be retried in 10s. The
   * retry interval will double three times, and then increase linearly by
   * 2^3 * 10s.  Finally, the job will retry at intervals of
   * [max_backoff_duration][google.cloud.scheduler.v1beta1.RetryConfig.max_backoff_duration] until the job has
   * been attempted [retry_count][google.cloud.scheduler.v1beta1.RetryConfig.retry_count] times. Thus, the
   * requests will retry at 10s, 20s, 40s, 80s, 160s, 240s, 300s, 300s, ....
   * The default value of this field is 5.
   * </pre>
   *
   * <code>int32 max_doublings = 5;</code>
   */
  int getMaxDoublings();
}
