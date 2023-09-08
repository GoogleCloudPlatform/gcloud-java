// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/kms/v1/service.proto

package com.google.cloud.kms.v1;

public interface CreateImportJobRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.kms.v1.CreateImportJobRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The [name][google.cloud.kms.v1.KeyRing.name] of the
   * [KeyRing][google.cloud.kms.v1.KeyRing] associated with the
   * [ImportJobs][google.cloud.kms.v1.ImportJob].
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   * <pre>
   * Required. The [name][google.cloud.kms.v1.KeyRing.name] of the
   * [KeyRing][google.cloud.kms.v1.KeyRing] associated with the
   * [ImportJobs][google.cloud.kms.v1.ImportJob].
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString
      getParentBytes();

  /**
   * <pre>
   * Required. It must be unique within a KeyRing and match the regular
   * expression `[a-zA-Z0-9_-]{1,63}`
   * </pre>
   *
   * <code>string import_job_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The importJobId.
   */
  java.lang.String getImportJobId();
  /**
   * <pre>
   * Required. It must be unique within a KeyRing and match the regular
   * expression `[a-zA-Z0-9_-]{1,63}`
   * </pre>
   *
   * <code>string import_job_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for importJobId.
   */
  com.google.protobuf.ByteString
      getImportJobIdBytes();

  /**
   * <pre>
   * Required. An [ImportJob][google.cloud.kms.v1.ImportJob] with initial field
   * values.
   * </pre>
   *
   * <code>.google.cloud.kms.v1.ImportJob import_job = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the importJob field is set.
   */
  boolean hasImportJob();
  /**
   * <pre>
   * Required. An [ImportJob][google.cloud.kms.v1.ImportJob] with initial field
   * values.
   * </pre>
   *
   * <code>.google.cloud.kms.v1.ImportJob import_job = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The importJob.
   */
  com.google.cloud.kms.v1.ImportJob getImportJob();
  /**
   * <pre>
   * Required. An [ImportJob][google.cloud.kms.v1.ImportJob] with initial field
   * values.
   * </pre>
   *
   * <code>.google.cloud.kms.v1.ImportJob import_job = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.cloud.kms.v1.ImportJobOrBuilder getImportJobOrBuilder();
}
