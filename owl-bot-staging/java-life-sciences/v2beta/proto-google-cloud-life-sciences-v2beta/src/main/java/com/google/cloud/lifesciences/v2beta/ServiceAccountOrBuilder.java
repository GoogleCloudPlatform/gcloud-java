// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/lifesciences/v2beta/workflows.proto

package com.google.cloud.lifesciences.v2beta;

public interface ServiceAccountOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.lifesciences.v2beta.ServiceAccount)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Email address of the service account. If not specified, the default
   * Compute Engine service account for the project will be used.
   * </pre>
   *
   * <code>string email = 1;</code>
   * @return The email.
   */
  java.lang.String getEmail();
  /**
   * <pre>
   * Email address of the service account. If not specified, the default
   * Compute Engine service account for the project will be used.
   * </pre>
   *
   * <code>string email = 1;</code>
   * @return The bytes for email.
   */
  com.google.protobuf.ByteString
      getEmailBytes();

  /**
   * <pre>
   * List of scopes to be enabled for this service account on the VM, in
   * addition to the cloud-platform API scope that will be added by default.
   * </pre>
   *
   * <code>repeated string scopes = 2;</code>
   * @return A list containing the scopes.
   */
  java.util.List<java.lang.String>
      getScopesList();
  /**
   * <pre>
   * List of scopes to be enabled for this service account on the VM, in
   * addition to the cloud-platform API scope that will be added by default.
   * </pre>
   *
   * <code>repeated string scopes = 2;</code>
   * @return The count of scopes.
   */
  int getScopesCount();
  /**
   * <pre>
   * List of scopes to be enabled for this service account on the VM, in
   * addition to the cloud-platform API scope that will be added by default.
   * </pre>
   *
   * <code>repeated string scopes = 2;</code>
   * @param index The index of the element to return.
   * @return The scopes at the given index.
   */
  java.lang.String getScopes(int index);
  /**
   * <pre>
   * List of scopes to be enabled for this service account on the VM, in
   * addition to the cloud-platform API scope that will be added by default.
   * </pre>
   *
   * <code>repeated string scopes = 2;</code>
   * @param index The index of the value to return.
   * @return The bytes of the scopes at the given index.
   */
  com.google.protobuf.ByteString
      getScopesBytes(int index);
}
