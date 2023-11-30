// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/managedidentities/v1/managed_identities_service.proto

package com.google.cloud.managedidentities.v1;

public interface GetDomainRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.managedidentities.v1.GetDomainRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The domain resource name using the form:
   * `projects/{project_id}/locations/global/domains/{domain_name}`
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Required. The domain resource name using the form:
   * `projects/{project_id}/locations/global/domains/{domain_name}`
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();
}
