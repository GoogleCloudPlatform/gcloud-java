/*
 * Copyright 2024 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/talent/v4beta1/company_service.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.talent.v4beta1;

public interface CreateCompanyRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.talent.v4beta1.CreateCompanyRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. Resource name of the tenant under which the company is created.
   *
   * The format is "projects/{project_id}/tenants/{tenant_id}", for example,
   * "projects/foo/tenant/bar". If tenant id is unspecified, a default tenant
   * is created, for example, "projects/foo".
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   *
   *
   * <pre>
   * Required. Resource name of the tenant under which the company is created.
   *
   * The format is "projects/{project_id}/tenants/{tenant_id}", for example,
   * "projects/foo/tenant/bar". If tenant id is unspecified, a default tenant
   * is created, for example, "projects/foo".
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString getParentBytes();

  /**
   *
   *
   * <pre>
   * Required. The company to be created.
   * </pre>
   *
   * <code>
   * .google.cloud.talent.v4beta1.Company company = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the company field is set.
   */
  boolean hasCompany();
  /**
   *
   *
   * <pre>
   * Required. The company to be created.
   * </pre>
   *
   * <code>
   * .google.cloud.talent.v4beta1.Company company = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The company.
   */
  com.google.cloud.talent.v4beta1.Company getCompany();
  /**
   *
   *
   * <pre>
   * Required. The company to be created.
   * </pre>
   *
   * <code>
   * .google.cloud.talent.v4beta1.Company company = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.talent.v4beta1.CompanyOrBuilder getCompanyOrBuilder();
}
