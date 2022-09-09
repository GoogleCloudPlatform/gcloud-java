// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/batch/v1alpha/job.proto

package com.google.cloud.batch.v1alpha;

public interface JobDependencyOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.batch.v1alpha.JobDependency)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Each item maps a Job name to a Type.
   * All items must be satisfied for the JobDependency to be satisfied (the AND
   * operation).
   * Once a condition for one item becomes true, it won't go back to false
   * even the dependent Job state changes again.
   * </pre>
   *
   * <code>map&lt;string, .google.cloud.batch.v1alpha.JobDependency.Type&gt; items = 1;</code>
   */
  int getItemsCount();
  /**
   * <pre>
   * Each item maps a Job name to a Type.
   * All items must be satisfied for the JobDependency to be satisfied (the AND
   * operation).
   * Once a condition for one item becomes true, it won't go back to false
   * even the dependent Job state changes again.
   * </pre>
   *
   * <code>map&lt;string, .google.cloud.batch.v1alpha.JobDependency.Type&gt; items = 1;</code>
   */
  boolean containsItems(
      java.lang.String key);
  /**
   * Use {@link #getItemsMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, com.google.cloud.batch.v1alpha.JobDependency.Type>
  getItems();
  /**
   * <pre>
   * Each item maps a Job name to a Type.
   * All items must be satisfied for the JobDependency to be satisfied (the AND
   * operation).
   * Once a condition for one item becomes true, it won't go back to false
   * even the dependent Job state changes again.
   * </pre>
   *
   * <code>map&lt;string, .google.cloud.batch.v1alpha.JobDependency.Type&gt; items = 1;</code>
   */
  java.util.Map<java.lang.String, com.google.cloud.batch.v1alpha.JobDependency.Type>
  getItemsMap();
  /**
   * <pre>
   * Each item maps a Job name to a Type.
   * All items must be satisfied for the JobDependency to be satisfied (the AND
   * operation).
   * Once a condition for one item becomes true, it won't go back to false
   * even the dependent Job state changes again.
   * </pre>
   *
   * <code>map&lt;string, .google.cloud.batch.v1alpha.JobDependency.Type&gt; items = 1;</code>
   */
  /* nullable */
com.google.cloud.batch.v1alpha.JobDependency.Type getItemsOrDefault(
      java.lang.String key,
      /* nullable */
com.google.cloud.batch.v1alpha.JobDependency.Type         defaultValue);
  /**
   * <pre>
   * Each item maps a Job name to a Type.
   * All items must be satisfied for the JobDependency to be satisfied (the AND
   * operation).
   * Once a condition for one item becomes true, it won't go back to false
   * even the dependent Job state changes again.
   * </pre>
   *
   * <code>map&lt;string, .google.cloud.batch.v1alpha.JobDependency.Type&gt; items = 1;</code>
   */
  com.google.cloud.batch.v1alpha.JobDependency.Type getItemsOrThrow(
      java.lang.String key);
  /**
   * Use {@link #getItemsValueMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.Integer>
  getItemsValue();
  /**
   * <pre>
   * Each item maps a Job name to a Type.
   * All items must be satisfied for the JobDependency to be satisfied (the AND
   * operation).
   * Once a condition for one item becomes true, it won't go back to false
   * even the dependent Job state changes again.
   * </pre>
   *
   * <code>map&lt;string, .google.cloud.batch.v1alpha.JobDependency.Type&gt; items = 1;</code>
   */
  java.util.Map<java.lang.String, java.lang.Integer>
  getItemsValueMap();
  /**
   * <pre>
   * Each item maps a Job name to a Type.
   * All items must be satisfied for the JobDependency to be satisfied (the AND
   * operation).
   * Once a condition for one item becomes true, it won't go back to false
   * even the dependent Job state changes again.
   * </pre>
   *
   * <code>map&lt;string, .google.cloud.batch.v1alpha.JobDependency.Type&gt; items = 1;</code>
   */

  int getItemsValueOrDefault(
      java.lang.String key,
      int defaultValue);
  /**
   * <pre>
   * Each item maps a Job name to a Type.
   * All items must be satisfied for the JobDependency to be satisfied (the AND
   * operation).
   * Once a condition for one item becomes true, it won't go back to false
   * even the dependent Job state changes again.
   * </pre>
   *
   * <code>map&lt;string, .google.cloud.batch.v1alpha.JobDependency.Type&gt; items = 1;</code>
   */

  int getItemsValueOrThrow(
      java.lang.String key);
}
