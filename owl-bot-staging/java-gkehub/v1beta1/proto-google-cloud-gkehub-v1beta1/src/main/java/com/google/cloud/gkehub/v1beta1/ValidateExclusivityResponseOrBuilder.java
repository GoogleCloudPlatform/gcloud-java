// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/gkehub/v1beta1/membership.proto

package com.google.cloud.gkehub.v1beta1;

public interface ValidateExclusivityResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.gkehub.v1beta1.ValidateExclusivityResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The validation result.
   *
   * * `OK` means that exclusivity is validated, assuming the manifest produced
   *    by GenerateExclusivityManifest is successfully applied.
   * * `ALREADY_EXISTS` means that the Membership CRD is already owned by
   *    another Hub. See `status.message` for more information.
   * </pre>
   *
   * <code>.google.rpc.Status status = 1;</code>
   * @return Whether the status field is set.
   */
  boolean hasStatus();
  /**
   * <pre>
   * The validation result.
   *
   * * `OK` means that exclusivity is validated, assuming the manifest produced
   *    by GenerateExclusivityManifest is successfully applied.
   * * `ALREADY_EXISTS` means that the Membership CRD is already owned by
   *    another Hub. See `status.message` for more information.
   * </pre>
   *
   * <code>.google.rpc.Status status = 1;</code>
   * @return The status.
   */
  com.google.rpc.Status getStatus();
  /**
   * <pre>
   * The validation result.
   *
   * * `OK` means that exclusivity is validated, assuming the manifest produced
   *    by GenerateExclusivityManifest is successfully applied.
   * * `ALREADY_EXISTS` means that the Membership CRD is already owned by
   *    another Hub. See `status.message` for more information.
   * </pre>
   *
   * <code>.google.rpc.Status status = 1;</code>
   */
  com.google.rpc.StatusOrBuilder getStatusOrBuilder();
}
