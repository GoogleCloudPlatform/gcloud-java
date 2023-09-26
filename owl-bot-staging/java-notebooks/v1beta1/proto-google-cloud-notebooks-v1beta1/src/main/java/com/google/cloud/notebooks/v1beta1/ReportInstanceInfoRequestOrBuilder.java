// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/notebooks/v1beta1/service.proto

package com.google.cloud.notebooks.v1beta1;

public interface ReportInstanceInfoRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.notebooks.v1beta1.ReportInstanceInfoRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. Format:
   * `projects/{project_id}/locations/{location}/instances/{instance_id}`
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Required. Format:
   * `projects/{project_id}/locations/{location}/instances/{instance_id}`
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * Required. The VM hardware token for authenticating the VM.
   * https://cloud.google.com/compute/docs/instances/verifying-instance-identity
   * </pre>
   *
   * <code>string vm_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The vmId.
   */
  java.lang.String getVmId();
  /**
   * <pre>
   * Required. The VM hardware token for authenticating the VM.
   * https://cloud.google.com/compute/docs/instances/verifying-instance-identity
   * </pre>
   *
   * <code>string vm_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for vmId.
   */
  com.google.protobuf.ByteString
      getVmIdBytes();

  /**
   * <pre>
   * The metadata reported to Notebooks API. This will be merged to the instance
   * metadata store
   * </pre>
   *
   * <code>map&lt;string, string&gt; metadata = 3;</code>
   */
  int getMetadataCount();
  /**
   * <pre>
   * The metadata reported to Notebooks API. This will be merged to the instance
   * metadata store
   * </pre>
   *
   * <code>map&lt;string, string&gt; metadata = 3;</code>
   */
  boolean containsMetadata(
      java.lang.String key);
  /**
   * Use {@link #getMetadataMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String>
  getMetadata();
  /**
   * <pre>
   * The metadata reported to Notebooks API. This will be merged to the instance
   * metadata store
   * </pre>
   *
   * <code>map&lt;string, string&gt; metadata = 3;</code>
   */
  java.util.Map<java.lang.String, java.lang.String>
  getMetadataMap();
  /**
   * <pre>
   * The metadata reported to Notebooks API. This will be merged to the instance
   * metadata store
   * </pre>
   *
   * <code>map&lt;string, string&gt; metadata = 3;</code>
   */
  /* nullable */
java.lang.String getMetadataOrDefault(
      java.lang.String key,
      /* nullable */
java.lang.String defaultValue);
  /**
   * <pre>
   * The metadata reported to Notebooks API. This will be merged to the instance
   * metadata store
   * </pre>
   *
   * <code>map&lt;string, string&gt; metadata = 3;</code>
   */
  java.lang.String getMetadataOrThrow(
      java.lang.String key);
}
