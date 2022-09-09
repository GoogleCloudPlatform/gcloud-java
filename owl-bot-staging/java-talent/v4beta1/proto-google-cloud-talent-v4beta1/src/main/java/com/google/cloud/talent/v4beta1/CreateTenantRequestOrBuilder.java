// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/talent/v4beta1/tenant_service.proto

package com.google.cloud.talent.v4beta1;

public interface CreateTenantRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.talent.v4beta1.CreateTenantRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. Resource name of the project under which the tenant is created.
   * The format is "projects/{project_id}", for example,
   * "projects/foo".
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   * <pre>
   * Required. Resource name of the project under which the tenant is created.
   * The format is "projects/{project_id}", for example,
   * "projects/foo".
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString
      getParentBytes();

  /**
   * <pre>
   * Required. The tenant to be created.
   * </pre>
   *
   * <code>.google.cloud.talent.v4beta1.Tenant tenant = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the tenant field is set.
   */
  boolean hasTenant();
  /**
   * <pre>
   * Required. The tenant to be created.
   * </pre>
   *
   * <code>.google.cloud.talent.v4beta1.Tenant tenant = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The tenant.
   */
  com.google.cloud.talent.v4beta1.Tenant getTenant();
  /**
   * <pre>
   * Required. The tenant to be created.
   * </pre>
   *
   * <code>.google.cloud.talent.v4beta1.Tenant tenant = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.cloud.talent.v4beta1.TenantOrBuilder getTenantOrBuilder();
}
