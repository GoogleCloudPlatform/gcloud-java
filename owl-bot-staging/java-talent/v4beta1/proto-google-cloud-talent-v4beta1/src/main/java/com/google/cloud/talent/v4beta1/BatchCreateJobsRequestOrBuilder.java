// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/talent/v4beta1/job_service.proto

package com.google.cloud.talent.v4beta1;

public interface BatchCreateJobsRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.talent.v4beta1.BatchCreateJobsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The resource name of the tenant under which the job is created.
   * The format is "projects/{project_id}/tenants/{tenant_id}". For example,
   * "projects/foo/tenant/bar". If tenant id is unspecified, a default tenant
   * is created. For example, "projects/foo".
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   * <pre>
   * Required. The resource name of the tenant under which the job is created.
   * The format is "projects/{project_id}/tenants/{tenant_id}". For example,
   * "projects/foo/tenant/bar". If tenant id is unspecified, a default tenant
   * is created. For example, "projects/foo".
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString
      getParentBytes();

  /**
   * <pre>
   * Required. The jobs to be created.
   * </pre>
   *
   * <code>repeated .google.cloud.talent.v4beta1.Job jobs = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  java.util.List<com.google.cloud.talent.v4beta1.Job> 
      getJobsList();
  /**
   * <pre>
   * Required. The jobs to be created.
   * </pre>
   *
   * <code>repeated .google.cloud.talent.v4beta1.Job jobs = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.cloud.talent.v4beta1.Job getJobs(int index);
  /**
   * <pre>
   * Required. The jobs to be created.
   * </pre>
   *
   * <code>repeated .google.cloud.talent.v4beta1.Job jobs = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  int getJobsCount();
  /**
   * <pre>
   * Required. The jobs to be created.
   * </pre>
   *
   * <code>repeated .google.cloud.talent.v4beta1.Job jobs = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  java.util.List<? extends com.google.cloud.talent.v4beta1.JobOrBuilder> 
      getJobsOrBuilderList();
  /**
   * <pre>
   * Required. The jobs to be created.
   * </pre>
   *
   * <code>repeated .google.cloud.talent.v4beta1.Job jobs = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.cloud.talent.v4beta1.JobOrBuilder getJobsOrBuilder(
      int index);
}
